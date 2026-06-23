package com.fullstack;
import java.util.*;
public class PaliTest {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a num");
		int n= sc.nextInt();
		int m=n;
		int rev=0;
		while(n!=0) {
			int digit= n %10;
			rev= rev*10+digit;
			n=n/10;
		}
		if(m==rev)
			System.out.println("palindrome");
		else
			System.out.println("Not a Palindrome");
	}

}
