package com.smartqueue.user_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/api/status")
    public String home() {
        return "User Service is running successfully";
    }

    @GetMapping("/api/users/test")
    public String test() {
        return "User API is working";
    }
}
