package Chp7;
import java.util.*;
class Emp{
	private String name;
	private double sal;
	public void setName(String name) {
		this.name=name;
	}
	public String getName(String name) {
		return this.name;
	}
	public void setSal(double sal) {
		this.sal=sal;
	}
	public double getSal(double sal) {
		return this.sal;
	}
}
public class Employee {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		Emp e1 = new Emp();
		System.out.println("Enter the Name: ");
		String n=sc.nextLine();
		e1.setName(n);
		System.out.println("Enter the Salary: ");
		double s = sc.nextDouble();
		e1.setSal(s);
		System.out.println("Name: "+e1.getName(n));
		System.out.println("Salaray: "+e1.getSal(s));
	}

}
