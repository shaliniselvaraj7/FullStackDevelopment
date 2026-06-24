package chp6;

class Tea1{
	String sub="Maths";
	void tea() {
		System.out.println("The Teacher Teaches "+sub);
	}
	
}
class Stu1 extends Tea1{
	void stu() {
		System.out.println("The Students Studied in 8th Grade and their Fav sub is Maths");
	}
}
class Staff extends Tea1{
	void staff() {
		System.out.println("The Teacher who teaches Maths is also a Class Staff of 8th Grade");
	}
}
public class StaffHie {
	public static void main(String [] args) {
		Stu1 s1 = new Stu1();
		Staff s2 = new Staff();
		s1.tea();
		s1.stu();
		s2.tea();
		s2.staff();
	}

}
