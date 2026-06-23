package chp6;

class Student {
	void stu(){
		System.out.println("The Student Studies in the class 8");
		
	}

}
class Mark1 extends Student{
	void maths() {
		System.out.println("He scored 90 marks in maths");
	}
}
class Mark2 extends Student{
	void science() {
		System.out.println("He scored 89 marks in science");
	}
}
public class hieararchicalInhe{
	public static void main(String [] args) {
		Mark1 m1 = new Mark1();
		Mark2 m2 = new Mark2();
		m1.stu();
		m1.maths();
		m2.stu();
		m2.science();
	}
}
