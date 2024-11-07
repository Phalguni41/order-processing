package com.example.order_processing.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.order_processing.models.InventoryItem;
import com.example.order_processing.repos.InventoryRepository;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;
    public InventoryItem updateInventory(InventoryItem inventoryItem) {
        return inventoryRepository.save(inventoryItem);
    }
    public List<InventoryItem> getAllItems() {
        return inventoryRepository.findAll();    
    }
}
