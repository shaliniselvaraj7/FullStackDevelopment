package Chp8;
import java.util.*;
public class LargestJagg {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int [][] num=new int[3][];
		num[0]=new int[2];
		num[1]=new int[3];
		num[2]=new int[1];
		System.out.println("Enter the Numbers:");
		for(int i= 0; i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				num[i][j]=sc.nextInt();
			}
		}
		System.out.println("Largest number of each row");
		for(int i=0; i<num.length;i++) {
			int max=0;
			for(int j=0;j<num[i].length;j++) {
				if(num[i][j]>=max) {
					max=num[i][j];
				
				}	}
			
				System.out.print("largest value of the row "+i+" = "+max );
				
			
			System.out.println();
		}
	}

}
