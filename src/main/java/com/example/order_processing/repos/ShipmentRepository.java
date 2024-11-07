package com.example.order_processing.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.order_processing.models.Shipment;

public interface ShipmentRepository extends JpaRepository<Shipment, Long> {
}