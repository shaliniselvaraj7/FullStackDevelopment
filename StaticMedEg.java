package Chp7;
import java.util.*;
import static java.lang.Math.*;
class Num{
	int num1;
	int num2;
	void display() {
		System.out.println("First Number is "+num1);
		System.out.println("Second Number is "+num2);
	}
}
public class StaticMedEg {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		Num n1 = new Num();
		System.out.println("Enter the first num: ");
		n1.num1=sc.nextInt();
		System.out.println("Enter the second num:  ");
		n1.num2=sc.nextInt();
		n1.display();
		System.out.println("Square Root of First Number: "+sqrt(n1.num1));
		System.out.println("Square Root of Second Number: "+sqrt(n1.num2));
		System.out.println("Power of the two numbers: "+pow(n1.num1,n1.num2));
	}
	

}
