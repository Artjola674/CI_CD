package com.example.CI_CD;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CiCdApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void test_fails() {
		assertThat("", 1==2);
	}

}
