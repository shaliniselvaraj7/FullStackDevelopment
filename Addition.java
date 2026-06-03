package com.fullstack;

import java.util.Scanner;

public class Addition {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first num for addition:");
		int num1= sc.nextInt();
		System.out.println("enter second num for addition:");
		int num2= sc.nextInt();
		System.out.println("addition:"+(num1+num2));
	}

}
