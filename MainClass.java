package p2;
import java.util.Scanner;
import p1.Employee;

class Contractor extends Employee{
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name :");
		name = sc.next();
		System.out.println("Enter dept");
		dept = sc.next();
		System.out.println("Enter salary");
		salary = sc.nextFloat();
	}
	void display() {
		System.out.println(name+ " " +dept+ " " +salary);
	}
}


public class MainClass {
	public static void main(String[] args) {
		Contractor cr = new Contractor();
		cr.input();
		cr.display();
	}

}
