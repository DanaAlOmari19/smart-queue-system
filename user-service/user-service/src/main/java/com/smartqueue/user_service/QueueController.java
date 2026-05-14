package com.smartqueue.user_service;

import com.smartqueue.user_service.model.QueueItem;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/queue")
public class QueueController {

    private List<QueueItem> queueItems = new ArrayList<>();

    public QueueController() {
        queueItems.add(new QueueItem(1L, 1L, 1L, "Clinic", 15, "WAITING"));
        queueItems.add(new QueueItem(2L, 2L, 2L, "Bank", 8, "WAITING"));
    }

    @GetMapping
    public List<QueueItem> getAllQueueItems() {
        return queueItems;
    }

    @GetMapping("/{id}")
    public QueueItem getQueueItemById(@PathVariable Long id) {
        for (QueueItem item : queueItems) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    @PostMapping
    public QueueItem addQueueItem(@RequestBody QueueItem queueItem) {
        queueItems.add(queueItem);
        return queueItem;
    }

    @PutMapping("/{id}/status")
    public QueueItem updateQueueStatus(@PathVariable Long id, @RequestParam String status) {
        for (QueueItem item : queueItems) {
            if (item.getId().equals(id)) {
                item.setStatus(status);
                return item;
            }
        }
        return null;
    }
}