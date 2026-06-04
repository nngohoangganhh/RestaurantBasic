package com.example.restaurant.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table (name = "restaurant_tables")
@Entity
public class TableRestaurant extends BaseEntity {
    @Column(name = "table_number")
    private int tableNumber;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "status")
    private String status;

}
