package Chap5;

class Laptop {
	String brand;
	int cost;
	Laptop(){
		brand="HP";
		cost= 45000;
		
	}

}
public class DefLaptop{
	public static void main(String [] args) {
		Laptop l1 = new Laptop();
		System.out.println("Brand: "+l1.brand+" Cost: "+l1.cost);
	}
}
