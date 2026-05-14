package com.smartqueue.user_service;

import com.smartqueue.user_service.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private List<User> users = new ArrayList<>();

    public UserController() {
        users.add(new User(1L, "Dana", "dana@example.com", "123456"));
        users.add(new User(2L, "Ahmad", "ahmad@example.com", "123456"));
    }

    @GetMapping
    public List<User> getAllUsers() {
        return users;
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        users.add(user);
        return user;
    }
}