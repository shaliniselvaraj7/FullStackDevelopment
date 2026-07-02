package Chp8;
import java.util.*;
public class TotEleJagg {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[][] n=new int[3][];
		n[0]=new int[3];
		n[1]=new int[2];
		n[2]=new int[1];
		int count=0;
		System.out.println("Enter the Numbers");
		for(int i=0; i<n.length;i++) {
			for(int j=0; j<n[i].length;j++) {
				n[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n.length;i++) {
			
			for(int j=0; j<n[i].length; j++) {
				count++;
			}
			
		}
		System.out.println("Total Elements: "+count);
	}
}
