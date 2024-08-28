package com.example.CI_CD.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/test")
    public String test() {
        return "This is an app used for testing CI/CD pipelines";
    }
}
