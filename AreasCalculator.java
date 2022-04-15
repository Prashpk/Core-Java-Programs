package projects1;

import java.util.Scanner;

public class AreasCalculator {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double r,Area;
		Scanner sc = new Scanner(System.in);
		char ch;
		
		do {
		System.out.println("1.Area of Circle");
		System.out.println("2.Area of Rectangle");
		System.out.println("3.Area of Triangle");
		System.out.println("4.Area of Square");
		System.out.println("Please Enter Your Choice");
		int choice = sc.nextInt();
		
		
		switch(choice) {
		
		case 1: 
			System.out.println("Enter the Radius of Circle :");
			r = sc.nextFloat();
			Area = 3.14 * r * r;
			System.out.println("Area of Circle is " +Area);
			break;
			
		case 2: 
			System.out.println("Enter the length of Rectangle :");
			int l = sc.nextInt();
			System.out.println("Enter the breadth of Rectangle :");
			int b = sc.nextInt();
			
			Area = l * b;
			System.out.println("Area of rectangle is " +Area);
			break;
			
		 case 3:
			    System.out.println("Enter the Height of Triangle :");
				int height = sc.nextInt();
				System.out.println("Enter the ba of Triangle :");
				int base = sc.nextInt();
				
				Area = (height * base)/2;
				System.out.println("Area of triangle is " +Area);
				break;
				
		 case 4: 
				System.out.println("Enter the side of Square :");
				int side = sc.nextInt();
				Area = side * side;
				System.out.println("Area of Square is " +Area);
				break;
		
		default:
			System.out.println("Invalid input!");
		}
		System.out.println("Do you want to exist Y?N");
		ch = sc.next().charAt(0);
		}
		while(ch!= 'N');
		System.out.println("You are out of the do while Loop!!");
		}
	}

