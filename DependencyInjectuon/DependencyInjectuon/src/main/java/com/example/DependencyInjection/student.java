package com.example.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class student {
    @Autowired
    private pen pen;
   /* @Autowired
    public void setPen(pen pen){
        this.pen=pen;
    }*/

    /*@Autowired
    public student(pen pen){
        this.pen=pen;
    }*/

   public void writeExam(){
        System.out.println("Student is writing exam");
        pen.write();


    }

}
