
//FUNCTION OVERLOADING EXAMPLE
class Addition1{
	void Addition(int i, int j) {
		int s= i+j;
		System.out.println("Sum of integers = "  +s);	
	}
	void Addition(float i, float j) {
		System.out.println("Sum of float = "  +(i+j));	
	}
	void Addition(double i, double j) {
		System.out.println("Sum of double =  "  +(i+j));	
	}
}
public class OverloadingExample {
	public static void main(String[] args) {		
		Addition1 sum = new Addition1();
		sum.Addition(10, 10);
		sum.Addition(200.20f, 100.10f);
		sum.Addition(300.50, 300.50);
	}
}
