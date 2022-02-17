package projects1;

import java.util.Scanner;

public class Temparature_conversions {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		float celcius, fareignheight;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("*****TEMPARATURE CONVERSION*******");
		System.out.println("1.Celcius to fareignheight Temparature");
		System.out.println("2.fareignheight to Ceicius Temparature");
		System.out.println("Please select your choice");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			
			System.out.println("Enter the Celcius Temp: ");
			celcius = sc.nextFloat();
			System.out.println("Finding the Fareignheight temparature");
			fareignheight = (celcius * 9/5) + 32;
			System.out.println("The fareignheight Temp is " +fareignheight+ "F");
			break;
			
		case 2:
			
			System.out.println("Enter the fareighnheight : ");
			 fareignheight= sc.nextFloat();
			 celcius = (fareignheight - 32) * 5/9;
			System.out.println("fareignheight to Celcius is " +celcius+ "C");
			break;
		default:
			System.out.println("Invalid input");
		

		}	

	}

}
