package com.fullstack;
import java.util.*;
public class LargestOfThree {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("First num:");
		int num1= sc.nextInt();
		System.out.print("Second num:");
		int num2= sc.nextInt();
		System.out.print("Third num:");
		int num3= sc.nextInt();
		if(num1>num2&&num1>num3)
			System.out.println("First num is largest");
		else if(num2>num1&&num2>num3)
			System.out.println("Second num is largest");
		else
			System.out.println("Third num is largest");	
	}

}
