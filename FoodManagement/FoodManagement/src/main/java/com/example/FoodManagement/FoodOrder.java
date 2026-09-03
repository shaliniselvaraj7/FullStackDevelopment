package com.example.FoodManagement;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FoodOrder {
    private int orderId;
    private String itemName;
    private int quantity;
    private double price;
}
