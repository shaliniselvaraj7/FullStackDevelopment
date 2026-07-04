package Chp8;
import java.util.*;
public class LarNumArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int lar = arr[0];
        for (int i = 1; i < 5; i++) {
            if (arr[i] > lar) {
                lar = arr[i];
            }
        }
        System.out.println("Largest number: " + lar);
    }
}