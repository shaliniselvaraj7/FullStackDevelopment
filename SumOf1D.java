package Chp8;

public class SumOf1D {

	public static void main(String[] args) {
		int[] num= {1,2,3,4,5};
		int sum =0;
		for(int i=0; i<num.length; i++) {
			sum+=i;
		}
		System.out.println("Sum "+sum);

	}

}
