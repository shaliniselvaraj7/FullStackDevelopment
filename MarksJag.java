package Chp8;
import java.util.*;
public class MarksJag {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		int[][] marks= new int[3][];
		marks[0]= new int[2];
		marks[1]= new int[4];
		marks[2]=new int[3];
		System.out.println("Enter the Marks of the Students:");
		for(int i=0; i<marks.length;i++) {
			for(int j=0; j<marks[i].length;j++) {
				marks[i][j]=sc.nextInt();
			}
		}
		System.out.println("Marks of the Students");
		for(int i=0; i<marks.length; i++) {
			for(int j=0; j<marks[i].length;j++) {
				System.out.print(marks[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
