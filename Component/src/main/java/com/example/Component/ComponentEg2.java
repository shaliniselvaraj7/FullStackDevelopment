package com.example.Component;

import org.springframework.stereotype.Component;

@Component
public class ComponentEg2 {
    int age = 10;
    String name = "Abi";
    public void display(){
        System.out.println("Name: "+name+" Age: "+age);
    }
}
