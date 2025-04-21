package com.spring.hospital.management.controller;

import com.spring.hospital.management.model.User;
import com.spring.hospital.management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public String signup(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @PostMapping("/signin")
    public String signin(@RequestBody User user) {
        boolean isAuthenticated = userService.authenticateUser(user);
        return isAuthenticated ? "Login successful!" : "Invalid credentials!";
    }
}
