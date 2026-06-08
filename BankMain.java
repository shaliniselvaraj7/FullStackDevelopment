package com.fullstack;
import java.util.*;
class BankAcc{
	String acc_name;
	double bal;
	void deposit(double amount) {
		bal+=amount;
	}
	void withdraw(double amp) {
		bal-=amp;
	}
	void display() {
		System.out.println("balance amount:"+bal);
	}

}
public class BankMain{
	public static void main(String[] args) {
		BankAcc ac1= new BankAcc();
		Scanner sc= new Scanner(System.in);
		System.out.println("Name:");
		ac1.acc_name= sc.nextLine();
		System.out.println("balance amount:");
		ac1.bal= sc.nextDouble();
	ac1.deposit(20000);
	ac1.withdraw(10000);
		ac1.display();
	}
}
