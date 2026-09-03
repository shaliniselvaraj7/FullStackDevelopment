package com.example.DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class pen {
    public void write(){
        System.out.println("Writing with Pen");
    }
}
