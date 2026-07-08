package Chp9;
import java.util.*;
abstract class School{
	String s_name;
	String city;
	School(String s_name, String city){
		this.s_name=s_name;
		this.city=city;
	}
	abstract void display();
}
class Student extends School{
	private int roll_no;
	String stu_name;
	int m1,m2,m3;
	Student(String s_name, String city, String stu_name){
		super(s_name,city);
		this.stu_name=stu_name;
		
	}
	public void setRollNo(int roll_no) {
		this.roll_no=roll_no;
	}
	public int getRollNo() {
		return roll_no;
	}
	void display() {
		int tot = m1 + m2 + m3;
	    System.out.println("\nSchool Name : " + s_name);
	    System.out.println("City        : " + city);
	    System.out.println("Student Name: " + stu_name);
	    System.out.println("Roll No     : " + roll_no);
	    System.out.println("Total Marks : " + tot);
	    if (tot >= 250)
	    	System.out.println("Grade A");
	    else if (tot >= 200)
	    	System.out.println("Grade B");
	    else if (tot >= 150)
	        System.out.println("Grade C");
	    else
	        System.out.println("Fail");
		
	}
	
}
public class CompleteJavaProg {
	public static void main(String [] args) {
		 Scanner sc = new Scanner(System.in);

	     System.out.print("Enter School Name: ");
	     String school = sc.nextLine();
	     System.out.print("Enter City: ");
	     String city = sc.nextLine();
	     System.out.print("Enter Student Name: ");
	     String name = sc.nextLine();
	     Student s = new Student(school, city, name);
	     System.out.print("Enter Roll No: ");
	     s.setRollNo(sc.nextInt());
	     System.out.print("Enter Mark1: ");
	     s.m1 = sc.nextInt();
	     System.out.print("Enter Mark2: ");
	     s.m2 = sc.nextInt();
	     System.out.print("Enter Mark3: ");
	     s.m3 = sc.nextInt();
	     s.display();
	}

}
