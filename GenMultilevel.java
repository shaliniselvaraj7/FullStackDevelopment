package chp6;

class GrandParents {
	String grandpa="Raj";
	String grandma="Saraswathi";
	void show() {
		System.out.println("Grandpa Name: "+grandpa+" Grandma Name: "+grandma);
	}

}
class Parents extends GrandParents{
	String dad="Kumar";
	String mom="Priya";
	void pat() {
		System.out.println("Father Name: "+dad+" Mother Name: "+mom);
	}
}
class Child1 extends Parents{
	String name="Anu";
	void display() {
		System.out.println("My Name: "+name);
	}
}
public class GenMultilevel{
	public static void main(String[] args) {
		Child1 c= new Child1();
		c.show();
		c.pat();
		c.display();
	}
}
