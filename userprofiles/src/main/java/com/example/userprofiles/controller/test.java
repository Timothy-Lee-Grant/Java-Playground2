package com.example.userprofiles.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    
    @GetMapping("/test")
    public String testEndpoint(){
        return "this thaioewaha!";
    }
}