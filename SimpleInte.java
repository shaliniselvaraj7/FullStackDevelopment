package com.fullstack;
import java.util.*;
public class SimpleInte {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the principal amount:");
		double p= sc.nextDouble();
		System.out.print("enter the rate of interest:");
		int r= sc.nextInt();
		System.out.print("enter the time:");
		int t= sc.nextInt();
		double si=(p*r*t)/100;
		System.out.print("Simple interest:"+si);
	}

}
