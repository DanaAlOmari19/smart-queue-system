package com.smartqueue.user_service;

import com.smartqueue.user_service.model.Notification;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    private List<Notification> notifications = new ArrayList<>();

    public NotificationController() {
        notifications.add(new Notification(1L, 1L, 1L, "Your turn is coming soon at Clinic", "SENT"));
        notifications.add(new Notification(2L, 2L, 2L, "Your turn is coming soon at Bank", "PENDING"));
    }

    @GetMapping
    public List<Notification> getAllNotifications() {
        return notifications;
    }

    @GetMapping("/{id}")
    public Notification getNotificationById(@PathVariable Long id) {
        for (Notification notification : notifications) {
            if (notification.getId().equals(id)) {
                return notification;
            }
        }
        return null;
    }

    @PostMapping
    public Notification addNotification(@RequestBody Notification notification) {
        notifications.add(notification);
        return notification;
    }

    @PutMapping("/{id}/status")
    public Notification updateNotificationStatus(@PathVariable Long id, @RequestParam String status) {
        for (Notification notification : notifications) {
            if (notification.getId().equals(id)) {
                notification.setStatus(status);
                return notification;
            }
        }
        return null;
    }
}