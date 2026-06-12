package WhileLoop;

public class DigOfNum {
	public static void main(String[] args) {
		int i=153;
		while(i!=0) {
			int digit=i%10;
			i=i/10;
			System.out.println("Digit "+digit);	
		
		}
		
	}

}
