package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Spring Boot! 7690hg4";
    }
    @GetMapping("/another")
    public String anotherOne(){
        return "you got another one";
    }
}
