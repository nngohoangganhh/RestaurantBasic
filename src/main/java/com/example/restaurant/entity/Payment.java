package com.example.restaurant.entity;

import jakarta.persistence.*;
import jakarta.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Table(name = "payment")
@Entity
@Builder
public class Payment extends BaseEntity {
    @Column(name = "order_id")
    private UUID orderId;

    @Column(name = "amount")
    private double amount;

    @Column(name = "method")
    private String method;

    @Column(name = "status")
    private String status;

    @Column(name = "transaction_code")
    private String transactionCode;

    @Column(name = "note")
    private String note;

    @Column(name = "paid_at")
    private LocalDateTime paidAt;
}
