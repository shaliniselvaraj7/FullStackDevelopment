package Chp10;
import java.util.*;
public class HashSetEg {
	public static void main(String [] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("Dog");
		hs.add("Cat");
		hs.add("Elephant");
		hs.add("Lion");
		System.out.println("HashSet: "+hs);
		System.out.println("Size of the HashSet: "+hs.size());
		System.out.println("Checks the element is available: "+hs.contains("Lion"));
	}

}
