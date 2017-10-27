package com.skools.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DashboardController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}