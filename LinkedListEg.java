package Chp10;
import java.util.*;
public class LinkedListEg {
	public static void main(String [] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Abi");
		list.add("Anu");
		list.addFirst("Banu");
		list.addLast("priya");
		System.out.println("List: "+list);
		System.out.println("First element: "+list.getFirst());
		System.out.println("Last element: "+list.getLast());
		list.removeFirst();
		list.removeLast();
		System.out.println("List After updating: "+list);
	}
}
