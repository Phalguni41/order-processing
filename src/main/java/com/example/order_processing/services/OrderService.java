package com.example.order_processing.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.order_processing.models.Order;
import com.example.order_processing.repos.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;
    public List<Order> getAllOrders() {
        return orderRepository.findAll(); // Fetches all orders from the database
    }
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }
}