package WhileLoop;

public class Fibo {
    public static void main(String[] args) {
	        int n = 10;
	        int a=0;
	        int b=1;
	        int count=0;
	        while(count<=n) {
	        	System.out.println(" "+a);
	        	int c=a+b;
	        	a=b;
	        	b=c;
	        	count++;
	        	
	        }
	        
		
	}

}
