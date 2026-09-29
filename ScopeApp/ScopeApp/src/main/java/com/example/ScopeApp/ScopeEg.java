package com.example.ScopeApp;

import org.springframework.aop.aspectj.annotation.PrototypeAspectInstanceFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ScopeEg {
    int age;
    public void display(){

        System.out.println("Age: " + age);
    }
}
