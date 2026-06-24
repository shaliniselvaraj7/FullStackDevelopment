package chp6;

class Veh {
	String brand ="Audi";
	void display() {
		System.out.println("The brand of the Vehicle"+brand);
		}
}
class Car1 extends Veh{
	String brand="BMW";
	void show() {
		System.out.println("The brand of the car "+brand);
		System.out.println("Car Brand:"+super.brand);
		
	}
	void display() {
		super.display();
	}
	
}
public class SupMethod{
	public static void main(String [] args) {
		Car1 c = new Car1();
		c.show();
		c.display();
	}
}
