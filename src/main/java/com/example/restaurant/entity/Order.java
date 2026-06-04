package com.example.restaurant.entity;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Setter
@Getter
@Table(name = "orders")
@Entity
public class Order extends BaseEntity {
    @Column(name = "table_id")
    private UUID tableId;

    @Column(name = "staff_id")
    private UUID staffId;

    @Column(name = "user_id")
    private UUID userId;

    @Column(name = "status")
    private String status;

    @Column(name = "total_amount")
    private double totalAmount;

    @Column(name = "note")
    private String note;

    @Column(name = "closed_at")
    private LocalDateTime closedAt;
}
