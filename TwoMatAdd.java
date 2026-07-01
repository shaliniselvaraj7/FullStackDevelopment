package Chp8;
import java.util.Scanner;
public class TwoMatAdd {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int[][] m1 = new int[2][2];
	        int[][] m2 = new int[2][2];
	        int[][] sum = new int[2][2];
	        System.out.println("Enter the elements of the first matrix:");
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                m1[i][j] = sc.nextInt();
	            }
	        }

	        System.out.println("Enter the elements of the second matrix:");
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                m2[i][j] = sc.nextInt();
	            }
	        }
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                sum[i][j] = m1[i][j] + m2[i][j];
	            }
	        }
	        System.out.println("Sum of the two matrices:");
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                System.out.print(sum[i][j] + " ");
	            }
	            System.out.println();
	        }

	    }
	}


