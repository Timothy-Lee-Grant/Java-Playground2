package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.reactive.function.client.WebClient;

@RestController
public class test {

    private final WebClient webClient = WebClient.create("http://localhost:8081");
    private final WebClient googleClient = WebClient.create("http://google.com/generate_204");
    @GetMapping("/test")
    public String testEndpoint(){
        String returnValue = webClient.get()
        .uri("/test")
        .retrieve()
        .bodyToMono(String.class)
        .block();
        return returnValue + " You Got It!!";
    }

    @GetMapping("/ping-google")
    public String pingGoogle(){
        String response = googleClient.get()
        .retrieve()
        .bodyToMono(String.class)
        .block();
        return response;
    }
}
