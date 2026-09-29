package com.example.SingletonAndPrototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeEg {
    String name;
    int age;
    public void show(){
        System.out.println("Name: "+name+" Age: "+age);
    }
}
