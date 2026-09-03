package com.example.FoodManagement;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class FoodService {
    private List<FoodOrder> orders = new ArrayList<>();

    public FoodService(){
        orders.add(new FoodOrder(1,"Burger",2,200));
        orders.add(new FoodOrder(2,"Pizza",1,500));
    }
    public List<FoodOrder> getOrders(){
        return orders;
    }
    public FoodOrder getOrderById(int id){
        for(FoodOrder order : orders){
            if(order.getOrderId()==id){
                return order;
            }
        }
        return null;
    }
    public void addOrder(FoodOrder order){
        orders.add(order);
    }

    public String updateFoodOrder(FoodOrder order) {
        for(int i =0; i<orders.size();i++){
            if(orders.get(i).getOrderId() == order.getOrderId()){
                orders.set(i,order);
                return "Order updated successfully";
            }
        }
        return "Order not found";
    }

    public String deleteFoodOrder(int orderId) {
        for(int i =0; i<orders.size(); i++){
            if(orders.get(i).getOrderId()==orderId){
                orders.remove(i);
                return "Order deleted Successfully";
            }
        }
        return " Order not found";
    }


}

