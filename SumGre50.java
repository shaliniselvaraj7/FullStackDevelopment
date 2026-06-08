package com.fullstack;

public class SumGre50 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=20;i++) {
			if(sum>50) {
				break;
			}
			System.out.println(sum);
			sum+=i;
		}
	}

}
