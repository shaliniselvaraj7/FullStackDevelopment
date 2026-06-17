package Chap5;

class Bank {
	int acc_no;
	int bal;
	String acc_name;
	Bank( int no, int b, String name){
		acc_no= no;
		bal= b;
		acc_name= name;	
	}
}
public class ParaConBank{
	public static void main(String [] args) {
		Bank b1 = new Bank(21678990,10000,"Abi");
		System.out.println("Account No:"+b1.acc_no+" ,Balance amt:"+b1.bal+" ,Name of the acc holder:"+b1.acc_name);
	}
}
