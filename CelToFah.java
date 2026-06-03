package com.fullstack;
import java.util.*;
public class CelToFah {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the celsius:");
		float c= sc.nextFloat();
		float f= (c*9/5)+32;
		System.out.println("fahrenheit:"+f);
		
		
	}

}
