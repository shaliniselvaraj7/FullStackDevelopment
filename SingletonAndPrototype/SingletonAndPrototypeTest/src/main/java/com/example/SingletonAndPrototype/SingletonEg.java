package com.example.SingletonAndPrototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class SingletonEg {
    String name;
    public void display(){
        System.out.println("Name:"+name);
    }
}
