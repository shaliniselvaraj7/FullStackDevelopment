package com.example.FoodManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/orders")
public class FoodController {
    @Autowired
    private FoodService foodService;
    @GetMapping
    public List<FoodOrder> getAllOrders(){
        return foodService.getOrders();
    }
    @GetMapping("/{id}")
    public FoodOrder getOrderById(@PathVariable int id){
        return foodService.getOrderById(id);
    }
    @PostMapping
    public String addOrder(@RequestBody FoodOrder order){
        foodService.addOrder(order);
        return "Order added Successfully";
    }
    @PutMapping
    public String updateFood(@RequestBody FoodOrder order){
        return foodService.updateFoodOrder(order);

    }
    @DeleteMapping("/{orderId}")
    public String deleteFoodOrder(@PathVariable int orderId){
        return foodService.deleteFoodOrder(orderId);
    }
}
