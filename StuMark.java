package com.fullstack;
import java.util.*;
public class StuMark {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the name of the student:");
		String name= sc.nextLine();
		System.out.print("enter the tamil mark:");
		int mark1= sc.nextInt();
		System.out.print("enter the english mark:");
		int mark2= sc.nextInt();
		System.out.print("enter the maths mark:");
		int mark3= sc.nextInt();
		System.out.println(name+" is scored in tamil:"+mark1+" in english:"+mark2+" and in maths:"+mark3);
		
	}

}
