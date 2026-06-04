package com.example.restaurant.service.impl;

import com.example.restaurant.entity.Payment;
import com.example.restaurant.repository.PaymentRepository;
import com.example.restaurant.service.PaymentService;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PaymentServiceImpl implements PaymentService {
    private final PaymentRepository paymentRepository;

    @Override
    public List<Payment> getPayment() {
        return paymentRepository.findAll();
    }
}
