package com.fullstack;
import java.util.*;
public class AreaOfRect {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the length of the rectangle:");
		float l= sc.nextFloat();
		System.out.println("enter the width of the rectangle:");
		float w= sc.nextFloat();
		System.out.println("area of rectangle:"+(l*w)+"cmsq");
	}

}
