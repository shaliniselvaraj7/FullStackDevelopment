package Chp10;
import java.util.*;
public class ArrayListEg {
	public static void main(String [] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		list.add("Mango");
		System.out.println("List: "+list);
		list.add(1,"Dragon Fruit");
		System.out.println("List After Insertion" +list);
		System.out.println("Element at index 3: "+list.get(4));
		System.out.println("Checks if the list is empty: "+list.isEmpty());
	}

}
