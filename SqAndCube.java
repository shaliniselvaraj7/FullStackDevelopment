package com.fullstack;
import java.util.*;
public class SqAndCube {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the num:");
		int num= sc.nextInt();
		int sq= num*num;
		System.out.println("Square of the num:"+sq);
		int cb= num*num*num;
		System.out.println("Cube of the num"+cb);
	}

}
