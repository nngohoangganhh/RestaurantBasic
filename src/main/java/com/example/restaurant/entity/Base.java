package com.example.restaurant.entity;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@MappedSuperclass
public abstract class Base {
    @Id
    private UUID id;

    @Column(name = "update_at")
    private LocalDateTime updateAt;

    @Column(name = "create_at")
    private LocalDateTime createAt;
}
