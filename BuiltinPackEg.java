package Chp7;
import java.util.*;
import java.math.*;
class Sqr{
	int n;
	void display() {
		System.out.println("The Number is: "+n);
	}
}
public class BuiltinPackEg {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Sqr s1 = new Sqr();
		System.out.println("Enter the number:");
		s1.n=sc.nextInt();
		s1.display();
		System.out.println("The Square Root of the Number: "+Math.sqrt(s1.n));
		
	}

}
