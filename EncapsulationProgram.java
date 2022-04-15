
//Encapsulation is the process of wrapping data and code together in a single unit called class.  
import java.util.Scanner;

class Student{

	String Name;
	long sid;
	int age;
	char Gender;
	float fees;
	Scanner sc = new Scanner(System.in);
	
	void Input() {
		System.out.println("Enter your Name :");
		Name = sc.nextLine();
		
		System.out.println("Enter your sid :");
		sid = sc.nextInt();
		
		System.out.println("Enter your age :");
		age = sc.nextInt();
		
		System.out.println("Enter your Gender :");
		Gender = sc.next().charAt(0);
		
	}
	
	void Display(){
		System.out.println("Name = " +Name);
		System.out.println("sid = " +sid);
		System.out.println("age = " +age);
		System.out.println("Gender = " +Gender);
	}
}

public class EncapsulationProgram {
	public static void main(String[] args) {
		
		int a[] = new int[5];
		Student s[] = new Student[3];
		
		for(int i=0;i<s.length;i++) {
			s[i] = new Student();
			
		}
		for(int i=0;i<s.length;i++) {
			s[i].Input();
		}
		System.out.println("Student Details : ");
		for(int i=0;i<s.length;i++) {
			
			s[i].Display();
		}	
		
//		Student obj1 = new Student();
//		Student obj2 = new Student();
//		obj1.Input();
//		obj1.Display();
//		obj2.Input();
//		obj2.Display();
	}

}
