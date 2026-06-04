package com.example.restaurant.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Table(name = "category")
@Entity
public class Category extends BaseEntity {
    @Column(name = "name")
    private String name;

    @Column(name = "display_order")
    private int displayOrder;
}
