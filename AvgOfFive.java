package com.fullstack;
import java.util.*;
public class AvgOfFive{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("First num:");
		int n1=sc.nextInt();
		System.out.print("Second num:");
		int n2= sc.nextInt();
		System.out.print("Third num");
		int n3= sc.nextInt();
		System.out.print("Forth num:");
		int n4= sc.nextInt();
		System.out.print("Fifth num:");
		int n5= sc.nextInt();
		float avg= (n1+n2+n3+n4+n5)/5;
		System.out.println("The average of the num:"+avg);
	}

}
