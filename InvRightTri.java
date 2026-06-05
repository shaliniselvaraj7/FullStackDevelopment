package com.fullstack;

public class InvRightTri {
	public static void main(String[] args) {
		int rows=5;
		int colu=5;
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=colu; j++) {
				
				if(i==1||j==1||i+j==6)
					System.out.print("*");
				else
					System.out.print(" ");
					
				
			}
			System.out.println();
		}
	}

}
