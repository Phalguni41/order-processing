package com.example.order_processing.dto;

import com.example.order_processing.models.Order;
import com.example.order_processing.models.Payment;
import com.example.order_processing.models.Shipment;
import java.util.List;

public class CreateOrderRequest {
    private Order order;
    private Payment payment;
    private Shipment shipment;
    private List<Long> inventoryItemIds;

    // Getters and Setters

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    public List<Long> getInventoryItemIds() {
        return inventoryItemIds;
    }

    public void setInventoryItemIds(List<Long> inventoryItemIds) {
        this.inventoryItemIds = inventoryItemIds;
    }
}
