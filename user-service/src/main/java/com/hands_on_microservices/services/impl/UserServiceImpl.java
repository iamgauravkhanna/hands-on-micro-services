package com.hands_on_microservices.services.impl;

import com.hands_on_microservices.entities.User;
import com.hands_on_microservices.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public User getUser(String userId) {
        return null;
    }
}