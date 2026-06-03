package com.example.restaurant.service;

import com.example.restaurant.dto.order.OrderRequest;
import com.example.restaurant.dto.order.OrderResponse;
import com.example.restaurant.entity.Order;
import com.example.restaurant.repository.OrderRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderResponse create(OrderRequest request){
        Order order= new Order();
        order.setTableName(request.getTableName());
        order.setStatus(request.getStatus());
        order.setNote(request.getNote());
        order.setTotalAmount(request.getTotalAmount());
        Order saved = new Order();
        return new OrderResponse(saved.getTableName(),saved.getStatus(),saved.getTotalAmount(),saved.getNote());
    }


    public OrderResponse getAll(OrderRequest request){

    }
}
