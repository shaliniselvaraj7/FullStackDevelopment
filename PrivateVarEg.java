package Chp7;
import java.util.*;
class Student{
	private int roll_no;
	private long aadhar_no;
	public void setRollNo(int roll_no) {
		this.roll_no=roll_no;
	}
	public int getRollNo() {
		return roll_no;
	}
	public void setAadhar(long aadhar_no) {
		this.aadhar_no=aadhar_no;
	}
	public long getAadhar(long aadhar_no) {
		return this.aadhar_no;
	}
	void display() {
		System.out.println("Roll No of the student:"+roll_no);
	}
}
public class PrivateVarEg {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		Student s1 = new Student();
		System.out.println("Enter the Roll No: ");
		int input=sc.nextInt();
		s1.setRollNo(input);	
		System.out.println("Enter the Aadhar No: ");
		long n = sc.nextLong();
		s1.setAadhar(n);
		System.out.println("Aadhar No of the Student:"+s1.getAadhar(n));
		s1.display();
		
	}

}
