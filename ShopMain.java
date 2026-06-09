package com.fullstack;
import java.util.*;
class Shop {
	String item_name;
	double qunt;
	double price;
	void Pri() {
		price=qunt*price;
	}
	void show() {
		System.out.println("Name of the item:"+item_name);
		System.out.println("Quantity of the item:"+qunt);
		System.out.println("Price of the item:"+price);
	}

}
public class ShopMain{
	public static void main(String[] args) {
		Shop s1= new Shop();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the item name:");
		s1.item_name= sc.nextLine();
		System.out.println("enter the quantity:");
		s1.qunt=sc.nextDouble();
		System.out.println("enter the price:");
		s1.price= sc.nextDouble();
		s1.Pri();
		s1.show();
	}
}
