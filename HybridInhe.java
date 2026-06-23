package chp6;

interface Payment{
	void pay();
}
class Creditcard implements Payment{
	public void pay(){
		System.out.println("The account holder has a credit card");
	}
}
class Upi implements Payment{
	public void pay() {
		System.out.println("The account holder has both Credit card and UPI");
	}
}
class OnlinePayment extends Upi{
	void display() {
		System.out.println("The account holder can use UPI for online payment");
	}
}
public class HybridInhe {
	public static void main(String [] args) {
		OnlinePayment op = new OnlinePayment();
		op.pay();
		op.display();
	}

}
