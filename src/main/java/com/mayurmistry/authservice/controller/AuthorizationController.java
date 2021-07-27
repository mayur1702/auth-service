package com.mayurmistry.authservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorizationController {

    @GetMapping(path = "/hello")
    public String helloWorld() {
        return "Hello world";
    }
}
