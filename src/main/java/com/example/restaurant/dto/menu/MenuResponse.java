package com.example.restaurant.dto.menu;

import lombok.*;

import java.util.UUID;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MenuResponse {
    private UUID id;
    private String name;
    private String description;
    private double price;
    private String category;
}
