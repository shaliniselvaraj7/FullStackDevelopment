package com.fullstack;
import java.util.*;
public class SwapTwoNum{
	public static void main(String [] args ) {
		Scanner sc= new Scanner(System.in);
		System.out.println("first num:");
		int num1= sc.nextInt();
		System.out.println("Second num:");
		int num2= sc.nextInt();
		int swap= num1;
		num1= num2;
		num2=swap;
		System.out.println("first num:"+num1);
		System.out.println("second num"+num2);
	}

}
