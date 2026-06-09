package com.fullstack;
import java.util.*;
class Circle {
	int r;
	double area;
	void Area() {
		area=3.14*(r*r);		
	}
	void show() {
		System.out.println("Area of the circle:"+area);
	}

}
public class CircleMain{
	public static void main(String[] args) {
		Circle c1=new Circle();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		c1.r=sc.nextInt();
		c1.Area();
		c1.show();
	}
}