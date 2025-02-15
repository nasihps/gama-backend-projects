package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/test")
public class TestController {

    @Autowired
    Environment environment;

    @GetMapping
    public String message() {
        return "from port# " + environment.getProperty("server.port");
    }

}
