package com.example.demo.controller;

import com.example.demo.model.Greeting;
import com.example.demo.service.GreetingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    private final GreetingService greetingService;


    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/greet")
    public String greet(@RequestParam(defaultValue = "World") String name, Model model) {
        System.out.println("the greet route has been hit");
        String message = greetingService.getGreeting(name);
        System.out.println(message);
        model.addAttribute("name", message);
        System.out.println("Returning view: greeting");
        return "greeting"; // maps to greeting.html
    }

    @GetMapping("/secondary")
    public String secondary(){
        return "greeting2";
    }
}
