package com.iiht.service.hello_server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/service")
public class helloServiceController {

    @GetMapping
    public String Testing(){
        return "hello-from-server";
    }

}
