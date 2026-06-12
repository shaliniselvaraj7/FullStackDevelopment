package WhileLoop;

public class Fact {
	public static void main(String [] args) {
		int i=1;
		int fact=1;
		while(i<=5) {
			fact*=i;
			i++;
		}
		System.out.println("Fact"+fact);
	}

}
