package com.example.restaurant.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import lombok.*;

@Getter
@Setter
@Table(name = "role")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Role extends BaseEntity {
    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
}
