package com.example.demo.controller;

//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpSession;

@RestController
public class SessionController {
    @GetMapping("/login")
    public String login(@RequestParam String username, HttpSession session){
        session.setAttribute("username", username);
        return "Logged in as " + username;
    }

    @GetMapping("/profile")
    public String profile(HttpSession session){
        String username = (String) session.getAttribute("username");
        if(username==null){
            return "Not logged in";
        }
        return "Welcome back, " + username + "!";
    }

    @GetMapping("logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "logged you out!";
    }

}
