package com.fullstack;
class Student {
	String name;
	int age;
	void display() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
	

}
public class StuOopMain{
	public static void main(String[] args) {
		Student s1= new Student();
		s1.name="Abinaya";
		s1.age=20;
		s1.display();
		
		Student s2= new Student();
		s2.name="Anu";
		s2.age=20;
		s2.display();
	}
}
