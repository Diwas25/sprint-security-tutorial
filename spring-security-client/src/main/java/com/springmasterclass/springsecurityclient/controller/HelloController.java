package com.springmasterclass.springsecurityclient.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello , Welcome to Daily Code Buffer!!";
    }
}
