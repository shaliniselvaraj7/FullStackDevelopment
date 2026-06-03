package com.fullstack;
import java.util.*;

public class Sample1 {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter your name:");
		String name= sc.nextLine();
		
		System.out.println("enter your fav subject:");
		String favsub= sc.nextLine();
		
		System.out.println("enter your age:");
		int age= sc.nextInt();
		 
		
		System.out.println("your name is "+name+" your age is "+age+" fav sub is "+favsub);
	}

}
