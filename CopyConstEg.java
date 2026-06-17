package Chap5;

class LapTop {
	String com_name;
	double cost;
	LapTop(String n, double m){
		com_name = n;
		cost = m;
	}
	LapTop(LapTop l){
		com_name = l.com_name;
		cost=l.cost;
	}
	void show() {
		System.out.println("Name of the Laptop:"+ com_name+" , Cost of the Laptop:"+cost);
	}

}
public class CopyConstEg{
	public static void main(String [] args) {
		LapTop l1= new LapTop("HP",40000);
		LapTop l2 = new LapTop(l1);
		l2.com_name="Dell";
		l1.show();
		l2.show();
		
	}
}
