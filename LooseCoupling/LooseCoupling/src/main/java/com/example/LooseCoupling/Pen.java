package com.example.LooseCoupling;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pen implements WriterTool {
    public void write(){
        System.out.println("Writing with Pen");
    }

}
