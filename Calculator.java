package SwitchCase;
import java.util.*;
public class Calculator {
	public static void main(String[] args) {
		int a =10;
		int b=20;
		Scanner sc= new Scanner(System.in);
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("Enter your choice:");
		int choice= sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("The Addition:"+(a+b));
			break;
		case 2:
			System.out.println("The Subtraction:"+(a-b));
			break;
		case 3: 
			System.out.println("The Multiplication:"+(a*b));
			break;
		case 4:
			System.out.println("The Division:"+(a/b));
			break;
		default:
			System.out.println("Invalid choice!");
			
			
		
		
		}
	}

}
