package com.smartqueue.user_service;

import com.smartqueue.user_service.model.Location;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/locations")
public class LocationController {

    private List<Location> locations = new ArrayList<>();

    public LocationController() {
        locations.add(new Location(1L, "Al-Shifa Clinic", "Clinic", "Gaza", 15, "AVAILABLE"));
        locations.add(new Location(2L, "Bank of Palestine", "Bank", "Gaza", 8, "AVAILABLE"));
    }

    @GetMapping
    public List<Location> getAllLocations() {
        return locations;
    }

    @GetMapping("/{id}")
    public Location getLocationById(@PathVariable Long id) {
        for (Location location : locations) {
            if (location.getId().equals(id)) {
                return location;
            }
        }
        return null;
    }

    @PostMapping
    public Location addLocation(@RequestBody Location location) {
        locations.add(location);
        return location;
    }

    @PutMapping("/{id}/waiting-count")
    public Location updateWaitingCount(@PathVariable Long id, @RequestParam int waitingCount) {
        for (Location location : locations) {
            if (location.getId().equals(id)) {
                location.setWaitingCount(waitingCount);
                return location;
            }
        }
        return null;
    }
}