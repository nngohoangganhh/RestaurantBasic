package com.example.restaurant.entity;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

// Table order_table {
//  id bigint [pk, increment]
//  user_id bigint [not null] // nhân viên order hoặc khách order
//  table_name bigint
//  status varchar(30) [not null, default: 'PENDING'] // PENDING, COOKING, SERVED, PAID, CANCELLED
//  total_amount decimal(12,2) [default: 0]
//  note text
//  created_at timestamp
//  updated_at timestamp
// }
@Setter
@Getter
@Table(name = "orders")
@Entity
public class Order extends Base {
    @Column(name = "user_id")
    private UUID userId;

    @Column(name = "table_name")
    private int tableName;

    @Column(name = "status")
    private String status;

    @Column(name = "total_amount")
    private double totalAmount;

    @Column(name = "note")
    private String note;
}
