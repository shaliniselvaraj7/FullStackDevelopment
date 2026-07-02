package Chp8;
import java.util.*;
public class RevJagg {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[][] n=new int[3][];
		n[0]=new int[3];
		n[1]=new int[2];
		n[2]=new int[1];
		System.out.println("Enter the Numbers");
		for(int i=0; i<n.length;i++) {
			for(int j=0; j<n[i].length;j++) {
				n[i][j]=sc.nextInt();
			}
		}
		System.out.println("Reversed Jagged Array");
		for(int i=n.length-1;i>=0;i--) {
			for(int j=n[i].length-1;j>=0;j--) {
				System.out.print(n[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
