/*POLY = Many
 * Morphism = forms
 */
//polymorphism example
//function overloading
class Overloading{
	
	void display() {
		System.out.println("no arguements");
	}
	void display(int i) {
		System.out.println("one arguement of type int");
	}
	void display(float i) {
		System.out.println("one arguement of type float");
	}
	void display(double i) {
		System.out.println("one arguement of type double");
	}
	void display(int i, int j) {
		System.out.println("two arguement of type int");
	}
	void display(float i, int j) {
		System.out.println("two arguement of type float and int");
	}
	void display(int i, float j) {
		System.out.println("two arguement of type int and float");
	}
	void display(double i, int j) {
		System.out.println("two arguement of type double and int");
	}
}

public class PolyMorfismEx {
	public static void main(String[] args) {
		Overloading ov =  new Overloading();
		ov.display();
		ov.display(23);
		ov.display(234.56f);
		ov.display(2487.56);
		ov.display(43,450.67f);
		ov.display(450.67,78);	
	}
}
