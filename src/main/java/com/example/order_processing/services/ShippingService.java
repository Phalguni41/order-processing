package com.example.order_processing.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.order_processing.models.Shipment;
import com.example.order_processing.repos.ShipmentRepository;

@Service
public class ShippingService {

    @Autowired
    private ShipmentRepository shipmentRepository;
    public Shipment shipOrder(Shipment shipment) {
        return shipmentRepository.save(shipment);
    }
    public List<Shipment> getAllShipments() {
        return shipmentRepository.findAll();
    }
}
