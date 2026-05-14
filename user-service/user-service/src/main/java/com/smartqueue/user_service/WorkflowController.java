package com.smartqueue.user_service;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/workflow")
public class WorkflowController {

    @GetMapping("/book")
    public Map<String, Object> bookQueue() {

        Map<String, Object> response = new HashMap<>();

        response.put("userId", 1);
        response.put("bookingStatus", "CONFIRMED");
        response.put("locationName", "Al-Shifa Clinic");
        response.put("queueNumber", 16);
        response.put("queueStatus", "WAITING");
        response.put("notification", "Your booking is confirmed. Your queue number is 16.");

        return response;
    }
}