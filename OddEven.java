package com.fullstack;

import java.util.Scanner;

public class OddEven {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number:");
		int num= sc.nextInt();
		String result= (num%2==0)? "Even":"Odd";
		System.out.print(result);
	}

}
