package Chp10;
import java.util.*; 
public class IteratorEg { 
    public static void main(String[] args) { 
        PriorityQueue<Integer> q = new PriorityQueue<>(); 
        q.add(10); 
        q.add(20); 
        q.add(30); 
        Iterator<Integer> it = q.iterator(); 
        while (it.hasNext()) { 
            System.out.println(it.next()); 
        } 
    } 
} 