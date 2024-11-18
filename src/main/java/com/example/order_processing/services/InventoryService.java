package com.example.order_processing.services;



import com.example.order_processing.models.InventoryItem;
import com.example.order_processing.repos.InventoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    @Secured("ROLE_ADMIN")
    public InventoryItem updateInventory(InventoryItem inventoryItem) {
        return inventoryRepository.save(inventoryItem);
    }

    public List<InventoryItem> getAllItems() {
        return inventoryRepository.findAll();
    }

    public List<InventoryItem> findAllById(List<Long> ids) {
        return inventoryRepository.findAllById(ids);
    }
}


