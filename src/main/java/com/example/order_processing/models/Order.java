package com.example.order_processing.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "order_service_orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String product;
    private Integer quantity;
    public Long getId() {
        return id;
    }
    public String getProduct() {
        return product;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setProduct(String product) {
        this.product = product;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Order() {
    }
    public Order(Long id, String product, Integer quantity) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
    }

   
}
