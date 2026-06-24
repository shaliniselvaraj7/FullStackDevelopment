package chp6;

class Veh1 {
	String type ="Two wheeler";
	void display() {
		System.out.println("Information about a Vehicle");
	}
	Veh1(String name ){
		System.out.println("The Name of the vehicle Shown below");
	}

}
class Car2 extends Veh1{
	String type="Four Wheeler";
	Car2(String name, int capacity){
		super(name);
		System.out.println("The Name: "+name+" Capacity: "+capacity);
	}
		void display() {
			System.out.println("The type"+super.type);
			System.out.println("The type we want"+type);
			
		}
		void show() {
			super.display();
			display();
		}
		
}
public class VehSuper{
	public static void main(String[] args) {
		Car2 c2 = new Car2("Audi",4);
		c2.show();
		
	}
}

