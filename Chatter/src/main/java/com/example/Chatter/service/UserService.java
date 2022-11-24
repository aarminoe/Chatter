package com.example.Chatter.service;

import com.example.Chatter.model.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUsers();
}
