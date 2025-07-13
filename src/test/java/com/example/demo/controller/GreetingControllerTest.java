package com.example.demo.controller;

import com.example.demo.service.GreetingService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(GreetingController.class)
class GreetingControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private GreetingService greetingService;

    @Test
    void testSayHello() throws Exception {
        when(greetingService.getGreeting("Timothy")).thenReturn("Hello, Timothy!");

        mockMvc.perform(get("/hello2?name=Timothy"))
               .andExpect(status().isOk())
               .andExpect(content().string("Hello, Timothy!"));
    }
}

