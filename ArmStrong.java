package com.fullstack;
import java.util.*;
public class ArmStrong{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the num:");
		int num= sc.nextInt();
		int sum=0;
		int original=num;
		while(num!=0) {
			int digit=num%10;
			sum= sum+(digit*digit*digit);
			num=num/10;
		}
		if(original==sum)
			System.out.print(sum+" ArmStrong num");
		else
			System.out.print(sum+" Not a Armstrong num");
		
	}
	
}