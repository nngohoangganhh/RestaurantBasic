package com.example.restaurant.dto.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderResponse {
    private int tableName;
    private String status;
    private double totalAmount;
    private String note;
}
