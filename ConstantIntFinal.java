package chp6;

class ConstantInterest{
	final int int_rate = 10;
	double prin= 10000;
	double time = 3;
	double interest;
	ConstantInterest(){
		interest=(prin*int_rate*time)/100;
		
	}
	void display() {
		System.out.println("The Constant Rate:"+interest);	
		}
}
public class ConstantIntFinal {
	public static void main(String [] args) {
		ConstantInterest c1 = new ConstantInterest();
		c1.display();
	}

}
