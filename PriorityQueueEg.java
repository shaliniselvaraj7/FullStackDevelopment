package Chp10;
import java.util.PriorityQueue; 
public class PriorityQueueEg { 
    public static void main(String[] args) { 
        PriorityQueue<Integer> q = new PriorityQueue<>(); 
        q.add(30); 
        q.add(10); 
        q.add(20); 
        System.out.println("Queue: " + q); 
        System.out.println("Removed: " + q.poll()); 
        System.out.println("Queue after poll: " + q); 
    } 
} 
