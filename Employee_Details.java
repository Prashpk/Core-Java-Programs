package projects1;

import java.util.Scanner;
public class Employee_Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		we need name, age, fees, gender
		String name;
		int age;
		float salary;
		char gender;
		
		@SuppressWarnings("resource")
		Scanner si =  new Scanner(System.in); 
		System.out.println("Enter the Employee NAME : ");
		name = si.next();
		System.out.println("Enter Employee AGE : ");
		age = si.nextInt();
		System.out.println("Enter Employee SALARY : ");
		salary = si.nextFloat();
		System.out.println("Enter Employee GENDER : ");
		gender = si.next().charAt(0);
		
		System.out.println("******** Employee Details *******\n");
		System.out.println("name = " +name);
		System.out.println("age = " +age);
		System.out.println("fees = " +salary);
		System.out.println("gender = " +gender);
		
		

	}

}
