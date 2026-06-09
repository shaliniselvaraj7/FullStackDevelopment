package com.fullstack;
import java.util.*;
class Lap {
	String brand;
	int ram;
	double price;
	void display() {
		System.out.println("Brand of the Laptop:"+brand);
		System.out.println("Ram of the Laptop:"+ram);
		System.out.println("Price of the Laptop:"+price);
	}

}
public class LapMain{
	public static void main(String [] args) {
		Lap l1= new Lap();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Brand:");
		l1.brand=sc.nextLine();
		System.out.println("Enter the Ram:");
		l1.ram= sc.nextInt();
		System.out.println("Enter the Price:");
		l1.price=sc.nextDouble();
		l1.display();
	}
}
