package com.example.restaurant.dto.menu;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MenuRequest {
    private String name;
    private String description;
    private double price;
    private String imageUrl;
    private String category;
    private boolean available;
}


