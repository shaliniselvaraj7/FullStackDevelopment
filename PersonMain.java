package com.fullstack;
import java.util.*;
class Person{
	String name;
	String city;
	int age;
	void display() {
		System.out.println("Name:"+name);
		System.out.println("city:"+city);
		System.out.println("Age:"+age);
	}

}
public class PersonMain{
	public static void main(String[] args) {
		Person p1=new Person();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the name:");
		p1.name=sc.nextLine();
		System.out.println("Enter the city:");
		p1.city=sc.nextLine();
		System.out.println("Enter the age:");
		p1.age=sc.nextInt();
		p1.display();
	}
}
