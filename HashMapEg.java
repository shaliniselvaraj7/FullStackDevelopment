package Chp10;

import java.util.HashMap; 
public class HashMapEg { 
    public static void main(String[] args) { 
        HashMap<Integer, String> students = new HashMap<>(); 
        students.put(101, "Shalini"); 
        students.put(102, "Rahul"); 
        students.put(103, "Priya"); 
        System.out.println(students); 
        System.out.println("Student with ID 102: " + students.get(102)); 
        students.remove(103); 
        System.out.println("After removing ID 103: " + students); 
    } 
} 
