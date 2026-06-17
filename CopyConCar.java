package Chap5;

class Car {
	String model;
	double price;
	Car(String n, double m){
		model=n;
		price=m;
	}
	Car(Car c){
		model = c.model;
		price= c.price;
	}
	void display() {
		System.out.println("Car Model:"+model+" ,Car Price:"+price);
	}

}
public class CopyConCar{
	public static void main(String [] args) {
		Car c1= new Car("Inova",100000);
		Car c2= new Car(c1);
		c2.model="Kia";
		c2.price= 200000;
		c1.display();
		c2.display();
	}
}
