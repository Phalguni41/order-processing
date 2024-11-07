package com.example.order_processing.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.order_processing.models.InventoryItem;

public interface InventoryRepository extends JpaRepository<InventoryItem, Long> {
}