package Chp9;
import java.util.*;
class InvalidPinException extends Exception{
	public InvalidPinException(String message) {
		super(message);
	}
}
class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String message) {
		super(message);
	}
}
class InvalidAmountException extends Exception{
	public InvalidAmountException(String message) {
		super(message);
	}
}
class EmptyPinException extends Exception{
	public EmptyPinException(String message) {
		super(message);
	}
}
class EmptyAmountException extends Exception{
	public EmptyAmountException(String message) {
		super(message);
	}
}
public class ATMSimulation {
	static void validate(Integer pin, Double amount, double balance) throws InvalidPinException, InsufficientBalanceException, InvalidAmountException, EmptyPinException, EmptyAmountException{
		if(pin!=1234) {
			throw new InvalidPinException("Incorrect PIN");
		}
		if(amount>balance) {
			throw new InsufficientBalanceException("Amount exceeds available balance");
		}
		if(balance - amount < 500){
			throw new ArithmeticException("Minimum balance should be maintained");
		}
		if(amount<100 || amount % 100 != 0) {
			throw new InvalidAmountException("Amount not valid");
		}
		System.out.println("Amount withdrawn Successfully");
	}
	public static void main(String [] args) {
		try {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the PIN:");
			String pinInput = sc.nextLine();

	        if (pinInput.trim().isEmpty()) {
	            throw new EmptyPinException("PIN cannot be Empty");
	        }
			System.out.println("Enter the Amount to Withdraw");
			 String amountInput = sc.nextLine();

		        if (amountInput.trim().isEmpty()) {
		            throw new EmptyAmountException("Amount cannot be Empty");
		        }

		        Integer pin = Integer.parseInt(pinInput);
		        Double amount = Double.parseDouble(amountInput);

		        validate(pin, amount, 2000);
		        
		}
		catch (InvalidPinException|InsufficientBalanceException|InvalidAmountException|EmptyPinException|EmptyAmountException  e ) {
			 System.out.println(e.getMessage());
		}
		catch(ArithmeticException e) {
			 System.out.println(e.getMessage());
		}
		
	}

}
