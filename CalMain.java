package com.fullstack;
import java.util.*;
class Cal {
	int n;
	int m;
	int add;
	int sub;
	int mul;
	double div;
	void Add() {
		add=n+m;
	}
	void Sub() {
		sub=n-m;
	}
	void Mul() {
		mul=n*m;
	}
	void Div() {
		div=n/m;
	}
	void show() {
	System.out.println("Addition:"+add);
	System.out.println("Subraction:"+sub);
	System.out.println("Multiplication:"+mul);
	System.out.println("Division:"+div);
	}
	

}
public class CalMain{
	public static void main(String[] args) {
		Cal c1= new Cal();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the first num:");
		c1.n=sc.nextInt();
		System.out.println("enter the second num:");
		c1.m=sc.nextInt();
		c1.Add();
		c1.Sub();
		c1.Mul();
		c1.Div();
		c1.show();
	}
}
