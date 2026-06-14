package Chap5;

public class StatIns {
	static int sum(int a, int b) {
		return a+b;
	}
	int avg(int a, int b) {
		int sum= a+b;
		return sum/2;
	}
	public static void main(String[] args) {
		System.out.println("The Addition:"+sum(20,50));
		StatIns si1= new StatIns();
		System.out.println("The Avg of the num:"+si1.avg(20,10));
	}

}
