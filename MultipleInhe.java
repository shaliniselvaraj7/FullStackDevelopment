package chp6;
interface Father{
	void fat();
}
interface Mother{
	void mot();
	
}
class Child implements Father, Mother{
	public void fat() {
		System.out.println("Ram is my father ");
	}
	public void mot() {
		System.out.println("Seetha is my mother");
	}
}
public class MultipleInhe{
	public static void main(String [] args) {
		Child c = new Child();
		c.fat();
		c.mot();
	}
}