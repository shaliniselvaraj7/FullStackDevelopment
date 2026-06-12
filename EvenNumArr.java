package EnhancedForLoop;

public class EvenNumArr {

	public static void main(String[] args) {
		int [] arr= {1,2,4,5,8,6};
		int even=arr[0];
		int count=0;
		for(int num:arr) {
			if(num%2==0) {
				count++;
			}
		}
		System.out.println("the count:"+count);

	}

}
