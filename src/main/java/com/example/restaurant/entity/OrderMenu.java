package com.example.restaurant.entity;

import jakarta.persistence.*;

@Table(name = "Order_menu")
@Entity
public class OrderMenu extends Base {

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "price")
    private double price;

    @Column(name = "subtotal")
    private double subtotal;

    @Column(name = "note")
    private String note;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_item_id")
    private Menu menuItem;
}
