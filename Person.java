package Chp7;
import java.util.*;
class Person1{
	private int roll_no;
	protected String name;
	public int age;
	 public void setRollNo(int roll_no) {
	        this.roll_no = roll_no;
	    }

	    public int getRollNo() {
	        return roll_no;
	    }
	
	void display() {
		System.out.println("Roll No: "+roll_no+" Name "+name+" Age: "+age);
	}
}
public class Person {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Person1 p1 = new Person1();
		
	
		System.out.println("Enter the Name: ");
		p1.name=sc.nextLine();
		System.out.println("Enter the Roll No: ");
		int input = sc.nextInt();
		p1.setRollNo(input);
		System.out.println("Enter the Age: ");
		p1.age=sc.nextInt();
		
		p1.display();
		
		
		
		
	}

}
