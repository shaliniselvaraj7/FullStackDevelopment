package com.fullstack;
import java.util.*;
public class LargestOfTwo {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the first num:");
		int num1= sc.nextInt();
		System.out.println("enter the second num:");
		int num2= sc.nextInt();
		String result= (num1>num2)? "First num is largest" : "Second number is Largest";
		System.out.println(result);
	}
}
