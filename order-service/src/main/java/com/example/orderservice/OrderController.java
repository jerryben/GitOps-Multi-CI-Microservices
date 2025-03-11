package com.example.orderservice;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private List<Order> orders = new ArrayList<>();

    @GetMapping
    public List<Order> getOrders() {
        return orders;
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        order.setId(orders.size() + 1);
        orders.add(order);
        return order;
    }
}

class Order {
    private int id;
    private String productName;
    private int quantity;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}