package projects1;

import java.util.Scanner;

public class Calulator_OPerations {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int ans;
		Scanner sc = new Scanner(System.in);		
		char ch;
		do {
		System.out.println("Enter First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();		
		System.out.println("*****MENU*****");
		System.out.println("Select your choice : ");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Remainder");
		int choice = sc.nextInt();
		
		switch(choice) {		
		case 1:
			  ans = num1 + num2;
			  System.out.println("Addition of " +num1+ " and " +num2+ " is " +ans);
			  break;
		case 2:
			  ans = num1 - num2;
			  System.out.println("Subtraction of " +num1+ " and " +num2+ " is " +ans);
			  break;
		case 3:
			  ans = num1 * num2;
			  System.out.println("Multiplication of " +num1+ " and " +num2+ " is " +ans);
			  break;
		case 4:
			  ans = num1 / num2;
			  System.out.println("Division of " +num1+ " and " +num2+ " is " +ans);
			  break;
		case 5:
			  ans = num1 % num2;
			  System.out.println("Modulus of " +num1+ " and " +num2+ " is " +ans);
			  break;
		default :
			System.out.println("Invalid input");
		}
		System.out.println("Do you want to exist Y?N");
		ch = sc.next().charAt(0);
	}
      while(ch!='N');
      System.out.println("You are out of Calculator!");
}
}