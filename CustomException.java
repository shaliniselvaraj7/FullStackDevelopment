package Chp9;

class InvalidClassException extends Exception{
	public InvalidClassException(String msg) {
		super(msg);
	}
	
}
public class CustomException {

	static void studentclass(int cls) throws InvalidClassException{
		if(cls!=8) 
			throw new InvalidClassException("Invalid Class Login");
		System.out.println("Valid Class Login");
	}

public static void main(String [] args) {
	try {
		studentclass(8);
	}
	catch(InvalidClassException e) {
		System.out.println(e.getMessage());
	}
}
}
