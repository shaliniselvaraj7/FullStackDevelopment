package Chp9;
import java.util.*;
class InvalidTrainException extends Exception{
	public InvalidTrainException(String message) {
		super(message);
	}
}
class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}
class TicketLimitException extends Exception{
	public TicketLimitException(String message) {
		super(message);
	}
}
public class RailwayTicketReservation {
	static void validate(String name, int age, int train_no, int tickets) throws InvalidTrainException, InvalidAgeException, TicketLimitException{
		if(name ==null || name.isEmpty()) {
			throw new NullPointerException("Name cannot be Empty");
		}
		if(age<5) {
			throw new InvalidAgeException("Age should be Atleast 5");
		}
		if (train_no != 12345) {
			throw new InvalidTrainException("Train name should be Valid");
		}
		if(tickets>6) {
			throw new TicketLimitException("Maximum 6 Tickets per booking");
		}
		System.out.println("Ticket Booked Successfully");
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the Name: ");
			String name = sc.nextLine();
			System.out.println("Enter the Age: ");
			int age = sc.nextInt();
			System.out.println("Enter the Train No: ");
			int train_no = sc.nextInt();
			System.out.println("Enter the No of tickets: ");
			int tickets = sc.nextInt();
			validate(name,age,train_no,tickets);
		}
		catch ( InvalidTrainException|InvalidAgeException|TicketLimitException e ) {
			System.out.println(e.getMessage());
		}
		catch (NullPointerException e) {
            System.out.println(e.getMessage());
		}
		catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numbers correctly.");
        }
	}

}
