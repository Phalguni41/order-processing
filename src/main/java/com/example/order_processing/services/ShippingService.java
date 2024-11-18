package com.example.order_processing.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.order_processing.models.Shipment;
import com.example.order_processing.repos.ShipmentRepository;

import jakarta.annotation.security.RolesAllowed;

@Service
public class ShippingService {

    @Autowired
    private ShipmentRepository shipmentRepository;
    
    @RolesAllowed("ADMIN")
    public Shipment shipOrder(Shipment shipment) {
        return shipmentRepository.save(shipment);
    }

    @RolesAllowed({"USER", "ADMIN"})
    public List<Shipment> getAllShipments() {
        return shipmentRepository.findAll();
    }
}
