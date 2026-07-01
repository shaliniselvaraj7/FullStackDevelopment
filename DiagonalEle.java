package Chp8;
import java.util.Scanner;

public class DiagonalEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] mat = new int[3][3];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Diagonal elements");
        for (int i = 0; i < 3; i++) {
            System.out.print(mat[i][i] + " ");
        }
    }
}