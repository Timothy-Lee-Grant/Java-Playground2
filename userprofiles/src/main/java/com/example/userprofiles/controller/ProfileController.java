package com.example.userprofiles.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;



@RestController
@RequestMapping("/profiles")
public class ProfileController {
    @GetMapping("/{username}")
    public ResponseEntity<String> getProfile(@PathVariable String username) {
        System.out.println("you are here");
        return ResponseEntity.ok("Profile info for " + username);
    }
}
