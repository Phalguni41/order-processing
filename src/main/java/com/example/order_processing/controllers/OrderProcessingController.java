package com.example.order_processing.controllers;
import com.example.order_processing.models.Order;
import com.example.order_processing.models.Payment;
import com.example.order_processing.models.InventoryItem;
import com.example.order_processing.models.Shipment;
import com.example.order_processing.services.OrderService;
import com.example.order_processing.services.PaymentService;
import com.example.order_processing.services.InventoryService;
import com.example.order_processing.services.ShippingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderProcessingController {

    @Autowired
    private OrderService orderService;
    
    @Autowired
    private PaymentService paymentService;
    
    @Autowired
    private InventoryService inventoryService;
    
    @Autowired
    private ShippingService shippingService;

    // Order Endpoints
    @PostMapping("/orders")
    public Order createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }

    @GetMapping("/orders")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    // Payment Endpoints
    @PostMapping("/payments")
    public Payment processPayment(@RequestBody Payment payment) {
        return paymentService.processPayment(payment);
    }

    @GetMapping("/payments")
    public List<Payment> getAllPayments() {
        return paymentService.getAllPayments();
    }

    // Inventory Endpoints
    @PostMapping("/inventory")
    public InventoryItem addInventory(@RequestBody InventoryItem item) {
        return inventoryService.updateInventory(item);
    }

    @GetMapping("/inventory")
    public List<InventoryItem> getAllInventoryItems() {
        return inventoryService.getAllItems();
    }

    // Shipping Endpoints
    @PostMapping("/shipments")
    public Shipment createShipment(@RequestBody Shipment shipment) {
        return shippingService.shipOrder(shipment);
    }

    @GetMapping("/shipments")
    public List<Shipment> getAllShipments() {
        return shippingService.getAllShipments();
    }
}

