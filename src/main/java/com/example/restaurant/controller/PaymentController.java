package com.example.restaurant.controller;

import com.example.restaurant.entity.Payment;
import com.example.restaurant.service.PaymentService;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class PaymentController {
    private final PaymentService paymentService;

    @GetMapping("/payment")
    public List<Payment> getPayment(){
        return paymentService.getPayment();
    }
}
