package Chap5;
import java.util.*;
class Hospital {
	 static String hos_name= "Global Hospital";
	 String patient_name;
	 void display() {
		 int fees=500;
		 System.out.println("The name of the Hospital:"+hos_name);
		 System.out.println("Patient Name:"+patient_name);
		 System.out.println("The consultation fee:"+fees);
	 }
}
public class HosMang{
	 public static void main(String[] args) {
			 Hospital h1 = new Hospital();
			 Scanner sc= new Scanner(System.in);
			 System.out.println("Enter the name:");
			 h1.patient_name= sc.nextLine();
			 h1.display();
		
		 }
	 }


