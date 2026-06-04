package com.example.restaurant.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Table(name = "menu")
@Entity
public class Menu extends BaseEntity {

    @Column(name = "category_id")
    private UUID categoryId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;

    @Column(name = "category")
    private String category;

    @Column(name = "available")
    private boolean available;

    @Column(name = "is_deleted")
    private boolean isDeleted;
}
