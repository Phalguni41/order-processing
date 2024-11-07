package com.example.order_processing.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.order_processing.models.Order;
public interface OrderRepository extends JpaRepository<Order, Long> {
}