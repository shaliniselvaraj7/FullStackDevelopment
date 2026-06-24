package chp6;

class Doc{
	void display() {
		System.out.println("The Doctor has 5 years of experience");
	}
}
class Patient extends Doc{
	void display() {
		System.out.println("The patient was suffering from cancer");
	}
	void show() {
		super.display();
		display();
	}
}
public class SupMedOverride {
	public static void main(String [] args) {
		Patient p = new Patient();
		p.show();
	}

}
