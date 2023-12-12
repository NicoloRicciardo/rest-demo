package com.example.restdemo.user;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    User user;
    List<User> users = new ArrayList<User>();

    public List<User> getAllUser() {
        return users;
    }

    public User getUserData() {
        return user;
    }

    public String createNewUser(@RequestBody User user) {
        this.user = user;
        users.add(user);
        return "User created successfully";
    }
}
