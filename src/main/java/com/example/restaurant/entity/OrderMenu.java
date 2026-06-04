package com.example.restaurant.entity;

import jakarta.persistence.*;
import jakarta.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@Table(name = "order_menu")
@Entity
@Builder
public class OrderMenu extends BaseEntity {

    @Column(name = "order_id")
    private UUID orderId;

    @Column(name = "menu_id")
    private UUID menuId;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "price")
    private double price;

    @Column(name = "subtotal")
    private double subtotal;

    @Column(name = "note")
    private String note;
}
