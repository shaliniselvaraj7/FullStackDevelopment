package Chp7;
import java.util.*;
class Mob{
	private String model;
	private double price;
	public void setMod(String model) {
		this.model=model;
	}
	public String getMod(String model) {
		return this.model;
	}
	public void setPri(double price) {
		this.price=price;
	}
	public double getPri(double price) {
		return this.price;
	}
}
public class MobilePhone {

	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		Mob m1 = new Mob();
		System.out.println("Enter the Model: ");
		String n=sc.nextLine();
		m1.setMod(n);
		System.out.println("Enter the Price: ");
		double s = sc.nextDouble();
		m1.setPri(s);
		System.out.println("Model: "+m1.getMod(n));
		System.out.println("Price: "+m1.getPri(s));
	}

}
