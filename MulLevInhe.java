package chp6;

class Teacher1 {
	void teach() {
		System.out.println("The teacher can teach");
	}

}
class Subject extends Teacher {
	void maths() {
		System.out.println("The teacher can teach maths");
	}
}
class Incharge extends Subject{
	void staff() {
		System.out.println("The teacher is the incharge of class 7 ");
	}
}
public class MulLevInhe{
	public static void main(String [] args) {
		Incharge i = new Incharge();
		i.teach();
		i.maths();
		i.staff();
	}
}

