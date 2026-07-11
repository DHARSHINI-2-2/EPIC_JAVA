package tasks;

public class Swapnumbers {
	public static void main(String[] args) {
		//swap with temporary variable
				int x=5, y=10, z;
				z=x;
				x=y;
				y=z;
				System.out.println("with temp variable");
				System.out.println("x:"+x);
				System.out.println("y:"+y);
				
				//without temporary variable
				int x1=5, y1=10;
				x1=x1+y1;
				y1=x1-y1;
				x1=x1-y1;
				System.out.println("swap without temp variable");
				System.out.println("x1:"+x1);
				System.out.println("y1:"+y1);
	}
}
