package com.example.order_processing.services;



import com.example.order_processing.models.Order;
import com.example.order_processing.models.Payment;
import com.example.order_processing.models.Shipment;
import com.example.order_processing.repos.*;
import com.example.order_processing.models.InventoryItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;
    
    @Autowired
    private PaymentRepository paymentRepository;
    
    @Autowired
    private ShipmentRepository shipmentRepository;
    


    public List<Order> getAllOrders() {
        return orderRepository.findAll(); // Fetches all orders from the database
    }

    public Order createOrder(Order order, Payment payment, Shipment shipment, List<InventoryItem> inventoryItems) {
        // Link the payment and shipment to this order
        payment.setOrder(order);
        shipment.setOrder(order);

        // Link the inventory items to this order
        order.setInventoryItems(inventoryItems);

        // Save the order first to ensure it has an ID for the payment and shipment references
        Order savedOrder = orderRepository.save(order);

        // Save payment and shipment after the order is saved
        paymentRepository.save(payment);
        shipmentRepository.save(shipment);

        // Since the relationship is bidirectional, ensure the order has references to payment and shipment
        savedOrder.setPayment(payment);
        savedOrder.setShipment(shipment);

        return savedOrder;
    }
}

