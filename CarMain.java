package com.fullstack;

class Car {
	String brand;
	String model;
	double price;
	void display() {
		System.out.println("Brand:"+brand);
		System.out.println("Model:"+model);
		System.out.println("Price:"+price);
	}

}
public class CarMain{
	public static void main(String[] args) {
		Car c1= new Car();
		c1.brand= "Maruti Suzuki";
		c1.model="Swift";
		c1.price=579000;
		c1.display();
	}
}
