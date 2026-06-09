package com.fullstack;
import java.util.*;
class Book {
	String bname;
	String auth;
	double price;
	void display() {
		System.out.println("Name of the book:"+bname);
		System.out.println("Author of the book:"+auth);
		System.out.println("Price of the book:"+price);
	}

}
public class BookMain{
	public static void main(String [] args) {
		Book b1= new Book();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name of the book:");
		b1.bname=sc.nextLine();
		System.out.println("Enter the name of the author:");
		b1.auth=sc.nextLine();
		System.out.println("Enter the price of the book:");
		b1.price=sc.nextDouble();
		b1.display();
	}
}
