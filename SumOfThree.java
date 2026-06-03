package com.fullstack;

import java.util.Scanner;

public class SumOfThree {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("first number:");
		int num1= sc.nextInt();
		System.out.println("second num:");
		int num2= sc.nextInt();
		System.out.println("third num:");
		int num3= sc.nextInt();
		int sum= num1+num2+num3;
		System.out.println("sum of three numbers:"+sum);
	}

}
