package Chp7;
import java.util.*;
class Bank{
	double bal;
	double amount;
	double amt;
	void deposit(double amount) {
		this.amount=amount;
		bal+=amount;
		System.out.println("Balance after deposit:"+bal);
	}
	void withdraw(double amt) {
		this.amt=amt;
		bal-=amt;
		System.out.println("Balance after withdraw:"+bal);
	}
}
public class BankAcc {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		Bank b1 = new Bank();
		System.out.println("Enter the Amount to deposit:");
		double amount=sc.nextDouble();
		b1.deposit(amount);
		System.out.println("Enter the Amount for Withdraw: ");
		double amt=sc.nextDouble();
		b1.withdraw(amt);
		
	}

}
