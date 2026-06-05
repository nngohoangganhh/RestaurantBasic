package com.example.restaurant.entity;

import jakarta.persistence.*;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Table(name = "users")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity {

    @Column(name = "role_id")
    private UUID roleId;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "password")
    private String password;
}
