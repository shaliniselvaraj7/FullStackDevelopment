package chp6;

class Teacher{
	void teach() {
		System.out.println("The teacher can teach.");
	}

}
class Sub extends Teacher{
	void maths() {
		System.out.println("The teacher can teach maths");
	}
}
public class SingInhe{
	public static void main(String [] args) {
		Sub s = new Sub();
		s.teach();
		s.maths();
	}
}
