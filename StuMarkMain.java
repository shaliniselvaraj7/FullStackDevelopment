package com.fullstack;
import java.util.*;
class StuMark1 {
	int m1;
	int m2;
	int m3;
	int tot;
	double avg;
	void Tot() {
		tot=m1+m2+m3;
	}
	void Avg() {
		avg=(m1+m2+m3)/3;
	}
	void show() {
		System.out.println("Total marks:"+tot);
		System.out.println("Average marks:"+avg);
	}

}
public class StuMarkMain{
	public static void main(String [] args) {
		StuMark1 s1= new StuMark1();
		Scanner sc= new Scanner(System.in);
		System.out.println("first mark:");
		s1.m1=sc.nextInt();
		System.out.println("second mark:");
		s1.m2=sc.nextInt();
		System.out.println("third mark:");
		s1.m3= sc.nextInt();
		s1.Tot();
		s1.Avg();
		s1.show();
		
	}
}
