package chp6;

class Animal {
	String ani="Wild Animal";
	Animal(){
		System.out.println("The Type of Animal "+ani);
		
	}

}
class Lion extends Animal{
	String name="Lion";
	Lion(){
		super();
		System.out.println("The Wild Animal "+name);
	}
	
}
public class SuperKeyConst{
	public static void main(String [] args) {
		Lion l1 = new Lion();
	
	}
}
