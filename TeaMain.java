package com.fullstack;
import java.util.*;
class Tea{
	String t_name;
	String t_sub;
	double t_sal;
	void show() {
		System.out.println("Name:"+t_name);
		System.out.println("subject:"+t_sub);
		System.out.println("Salary:"+t_sal);
	}

}
public class TeaMain{
	public static void main(String[] args) {
		Tea t1= new Tea();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the name");
		t1.t_name=sc.nextLine();
		System.out.println("enter the Subject");
		t1.t_sub=sc.nextLine();
		System.out.println("enter the Salary");
		t1.t_sal=sc.nextDouble();
		t1.show();
	}
}
