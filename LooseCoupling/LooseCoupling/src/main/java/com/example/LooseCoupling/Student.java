package com.example.LooseCoupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Autowired
    public Student( @Qualifier("sketch") WriterTool tool){
       this.tool = tool;
    }
    private WriterTool tool;
    public void writeExam(){
        System.out.println("Student is writing");
        tool.write();
    }
}
