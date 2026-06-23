package com.fullstack;
import java.util.*;
public class PrimeTest {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the num:");
		int n= sc.nextInt();
		int m=0;
		for (int i=1; i<=n; i++) {
			if(n%i==0) {
				m++;
			}
		}
		if(m==2)
			System.out.println("prime num");
		else
			System.out.println("not a prime num");
	}

}
