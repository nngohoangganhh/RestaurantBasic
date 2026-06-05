package com.example.restaurant.dto.category;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CategoryResponse {
    private UUID id;
    private String name;
    private int displayOrder;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

}
