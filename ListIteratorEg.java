package Chp10;
import java.util.*; 
public class ListIteratorEg { 
    public static void main(String[] args) { 
        ArrayList<String> list = new ArrayList<>(); 
        list.add("Apple"); 
        list.add("Banana"); 
        list.add("Mango"); 
        ListIterator<String> it = list.listIterator(); 
        while (it.hasNext()) { 
            System.out.println(it.next()); 
        } 
    } 
} 