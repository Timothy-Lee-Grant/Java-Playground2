package com.example.demo.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GreetingServiceTest {

    private final GreetingService greetingService = new GreetingService();

    @Test
    void testGetGreeting() {
        String result = greetingService.getGreeting("Timothy");
        assertEquals("Hello, Timothy!", result);
    }
}
