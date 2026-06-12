package EnhancedForLoop;

public class ConcatenateStr {
	public static void main(String[] args) {
		String[] arr= {"Apple","mango","orange","grape"};
		String con="";
		for(String str:arr) {
			con= con+str;
			
		}
		System.out.println("the concatenated string is :"+con);
	}
}
