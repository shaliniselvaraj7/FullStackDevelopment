package Chp9;
import java.util.Scanner;
class InvalidUserException extends Exception {
    public InvalidUserException(String message) {
        super(message);
    }
}
class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}
class WeakpasswordException extends Exception {
    public WeakpasswordException(String message) {
        super(message);
    }
}
class EmptyUsernameException extends Exception {
    public EmptyUsernameException(String message) {
        super(message);
    }
}
public class LoginPage {
    static void validate(String username, String password) throws InvalidUserException, InvalidPasswordException, WeakpasswordException, EmptyUsernameException {
        if (username == null || username.isEmpty()) {
            throw new EmptyUsernameException("Username cannot be empty");
        }
        if (password == null || password.isEmpty()) {
            throw new NullPointerException("Password cannot be empty");
        }
        if (!username.equals("admin")) {
            throw new InvalidUserException("Invalid username");
        }
        if (password.length() < 8) {
            throw new WeakpasswordException("Password is too weak");
        }
        
        if (!password.equals("password@123")) {
            throw new InvalidPasswordException("Invalid password");
        }
          
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Login Aunthentication");
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        try {
            validate(username, password);
            System.out.println("Login successful");
        } catch (InvalidUserException | InvalidPasswordException | WeakpasswordException | EmptyUsernameException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
}
}