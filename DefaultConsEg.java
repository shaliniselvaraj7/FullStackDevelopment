package Chap5;

class Student {
	String s_name;
	int roll_no;
	int marks;
	Student(){
		s_name="Abinaya";
		roll_no= 101;
		marks= 95;
	}

}
public class DefaultConsEg{
	public static void main(String [] args) {
		Student s1= new Student();
		System.out.println("Name: "+s1.s_name+" Roll No: "+s1.roll_no+" Marks: "+s1.marks);
	}
}
