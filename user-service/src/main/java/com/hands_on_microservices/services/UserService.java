package com.hands_on_microservices.services;

import com.hands_on_microservices.entities.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    List<User> getAllUser();

    User getUser(String userId);

}