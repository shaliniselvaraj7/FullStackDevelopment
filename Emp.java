package chp6;

class Per {
	void per() {
		String name="Balu";
		System.out.println("The person "+name+" lives in chennai");
	}

}
class Emp1 extends Per{
	String pos="Manager";
	void emp() {
		System.out.println("The Person worked as a "+pos+" in ABC company at Chennai");
		
	}
}
public class Emp{
	public static void main(String [] args) {
		Emp1 e1= new Emp1();
		e1.per();
		e1.emp();
	}
}
