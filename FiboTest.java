package com.fullstack;
import java.util.*;
public class FiboTest {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no of terms:");
		int n= sc.nextInt();
		System.out.println("Fibonacci Series is:");
		int a=0;
		int b=1;
		for(int i=1; i<=n;i++) {
			System.out.println(a+" ");
			int c= a+b;
			a=b;
			b=c;
		}
		
	}

}
