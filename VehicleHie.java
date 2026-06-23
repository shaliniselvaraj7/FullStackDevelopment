package chp6;

class Vehicle {
	void veh() {
		System.out.println("Roadway Vehicles");
	}

}
class Car extends Vehicle{
	void car() {
		System.out.println("Bike has two wheels");
	}
}
class Bike extends Vehicle{
	void bike() {
		System.out.println("Car has four wheels");
	}
}
public class VehicleHie{
	public static void main(String [] args) {
		Car c1 = new Car();
		Bike b1 = new Bike();
		c1.veh();
		c1.car();
		b1.veh();
		b1.bike();
	}
}
