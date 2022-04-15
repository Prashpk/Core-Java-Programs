package projects1;

import java.util.Scanner;
public class StudentInformation {

	public static void main(String[] args) {
//		we need name, age, fees, gender
		String name;
		int age;
		float fees;
		char gender;
		

		Scanner si =  new Scanner(System.in); 
		System.out.println("Enter the Student NAME : ");
		name = si.next();
		System.out.println("Enter Student AGE : ");
		age = si.nextInt();
		System.out.println("Enter Student FEES : ");
		fees = si.nextFloat();
		System.out.println("Enter Student GENDER : ");
		gender = si.next().charAt(0);
		
		System.out.println("Student name is " +name);
		System.out.println("Student age is " +age);
		System.out.println("Student fees is " +fees);
		System.out.println("Student gender is " +gender);
		
		

	}

}
