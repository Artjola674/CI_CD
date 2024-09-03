
FROM jelastic/maven:3.9.5-openjdk-21 AS build
WORKDIR /usr/app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

FROM openjdk:21

EXPOSE 8083

COPY ./target/CI_CD-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "CI_CD-0.0.1-SNAPSHOT.jar"]

