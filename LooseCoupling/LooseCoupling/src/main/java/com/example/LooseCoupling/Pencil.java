package com.example.LooseCoupling;

import org.springframework.stereotype.Component;

@Component
public class Pencil implements WriterTool {
    public void write(){
        System.out.println("Writing with Pen");
    }
}
