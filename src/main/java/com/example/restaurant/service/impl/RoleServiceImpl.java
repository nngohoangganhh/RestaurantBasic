package com.example.restaurant.service.impl;

import com.example.restaurant.entity.Role;
import com.example.restaurant.repository.RoleRepository;
import com.example.restaurant.service.RoleService;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    @Override
    public List<Role> getRole() {
        return roleRepository.findAll();
    }
}
