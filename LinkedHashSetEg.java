package Chp10;
import java.util.*;
public class LinkedHashSetEg {
	public static void main(String [] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(50);
		lhs.add(20);
		lhs.add(10);
		lhs.add(30);
		lhs.add(40);
		lhs.add(50);
		System.out.println("LinkedHashSet: "+lhs);
		System.out.println("checks the element: "+lhs.contains(30));
		System.out.println("First element: "+lhs.getFirst());
	}

}
