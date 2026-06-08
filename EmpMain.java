package com.fullstack;

import java.util.Scanner;

class Employee {
	String emp_name;
	int emp_id;
	double emp_sal;
	void show() {
		System.out.println("Emp id:"+emp_id);
		System.out.println("Emp Name:"+emp_name);
		System.out.println("Emp Sal:"+emp_sal);
		
	}

}
public class EmpMain{
	public static void main(String[] args) {
		Employee emp= new Employee();
		Scanner sc= new Scanner(System.in);
		System.out.println("Emp Name:");
		emp.emp_name= sc.nextLine();
		System.out.println("Emp Id:");
		emp.emp_id= sc.nextInt();
		
		System.out.println("Emp Salary:");	
		emp.emp_sal= sc.nextDouble();
		emp.show();	
		sc.close();
		
	}
}
