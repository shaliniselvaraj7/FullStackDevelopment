package com.fullstack;
import java.util.*;
class Rectangle {
	
	double l;
	double w;
	double area;
	double peri;
	void Area() {
		area=l*w;
	}
	void Peri() {
		peri= 2*(l+w);
		
	}
	void display() {
		System.out.println("Area of rectangle:"+area);
		System.out.println("Perimeter of rectangle:"+peri);
	}

}
public class RectMain{
	public static void main(String[] args) {
		Rectangle r1= new Rectangle();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the length");
		r1.l=sc.nextDouble();
		System.out.println("enter the width:");
		r1.w=sc.nextDouble();
		r1.Area();
		r1.Peri();
		r1.display();
		
		
	}
}