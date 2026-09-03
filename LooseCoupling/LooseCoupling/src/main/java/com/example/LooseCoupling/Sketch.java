package com.example.LooseCoupling;

import org.springframework.stereotype.Component;

@Component
public class Sketch implements WriterTool {
    public void write(){
        System.out.println("Writing with Sketch");
    }
}
