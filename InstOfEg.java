package chp6;

class Animal1{
	void display() {
	System.out.println("The Animal Class");
	}
	
}
class Dog1 extends Animal1{
	void show() {
		System.out.println("The Dog Class");
	}
	
}
public class InstOfEg {
	public static void main(String [] args) {
		Dog1 d1 = new Dog1();
		d1.display();
		d1.show();
		System.out.println("Checking that Dog is instance of Animal");
		System.out.println(d1 instanceof Animal1);
	}

}
