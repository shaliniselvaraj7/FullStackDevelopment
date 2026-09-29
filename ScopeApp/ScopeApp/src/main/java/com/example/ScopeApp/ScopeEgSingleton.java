package com.example.ScopeApp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton") //singleton default
public class ScopeEgSingleton {
    String name;
    public void show(){

        System.out.println("Name: "+name);
    }
}
