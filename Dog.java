package chp6;

class Breed {
	Breed(String breed){
		System.out.println("The breed of the dog");
	}	
}
class Name extends Breed{
	Name(String breed, String name){
		super(breed);
		System.out.println("The breed"+breed);
		System.out.println("The name of the dog"+name);
	}
	
}
public class Dog{
	public static void main(String [] args) {
		Name n1= new Name("Bulldog","Pluto");
	}
}
