package com.example.spring_boot.spring_boot_test;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String  greet() {
        return "Hello from GreetingService";
    }
}
