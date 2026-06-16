package Chap5;

class Book {
	int book_id;
	String b_name;
	Book(int id, String name){
		book_id=id;
		b_name=name;
	}

}
public class ParameterizedEg{
	public static void main(String [] args) {
		Book b1= new Book(101, "Mahabarat");
		System.out.println(" book id: "+b1.book_id+" name of the book:"+b1.b_name);	
		}
}
