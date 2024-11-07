package com.example.order_processing.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.order_processing.models.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
