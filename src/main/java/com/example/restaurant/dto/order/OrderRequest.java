package com.example.restaurant.dto.order;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class OrderRequest {
    private int tableName;
    private String status;
    private double totalAmount;
    private String note;
}
