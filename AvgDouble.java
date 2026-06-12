package EnhancedForLoop;

public class AvgDouble {

	public static void main(String[] args) {
		int []a= {10,20,30,10};
		int []b= {20,50,40,20};
		int avg1=0;
		int avg2=0;
		int avg3=0;
		int sum=0;
		for(int n:a) {
			sum+=n;
		}
		avg1=sum/4;
		System.out.println("the avg of first arr"+avg1);
		
		int sum1=0;
		for(int m:b) {
			sum1+=m;
		}
		avg2=sum1/4;
		System.out.println("the avg of sec arr "+avg2);
		
		avg3=(avg1+avg2)/2;
		System.out.println("The avg of double arr is"+avg3);
	}

}
