package chp6;

class Person {
	void per() {
		System.out.println("He is a person");
	}
}
class Employee extends Person{
	void emp() {
		System.out.println("He is the employee of an ABC company");
	}
}
class Manager extends Employee{
	void man() {
		System.out.println("He is also an Manager in ABC company");
	}
}
public class PersonMultilevel{
	public static void main (String [] args) {
		Manager m1 = new Manager();
		m1.per();
		m1.emp();
		m1.man();
		
	}
}
