package com.example.restdemo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/get-all")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping("/get-user")
    public User getUserData() {
        return userService.getUserData();
    }

    @PostMapping
    public String createNewUser(@RequestBody User user) {
        userService.createNewUser(user);
        return "User created successfully";
    }
}