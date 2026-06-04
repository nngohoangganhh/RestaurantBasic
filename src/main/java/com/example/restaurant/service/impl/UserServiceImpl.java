package com.example.restaurant.service.impl;

import com.example.restaurant.entity.User;
import com.example.restaurant.repository.UserRepository;
import com.example.restaurant.service.UserService;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
