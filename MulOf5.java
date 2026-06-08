package com.fullstack;

public class MulOf5 {
	public static void main(String [] args) {
		for(int i=1;i<=10;i++) {
			if((i*5)>30) {
				break;
			}
			System.out.println(i+" * 5 ="+i*5);
		}
	}

}
