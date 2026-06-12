package WhileLoop;

public class CountNumDig {

	public static void main(String[] args) {
		int i=1757;
		int count=0;
		while(i!=0) {
			int dig= i%10;
			i=i/10;
			count++;
			
		}
		System.out.println("The count:"+count);
	}

}
