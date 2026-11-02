package com.example.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello! My DevOps project is running.";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
