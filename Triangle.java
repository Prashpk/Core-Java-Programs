package projects1;

import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
	
		float Height,base,Area;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Height of Triangle :");
		 Height= sc.nextInt();
		System.out.println("Enter the base of Triangle :");
		base = sc.nextInt();
		Area = ( Height * base)/2;
		System.out.println("the area of triangle with base " +base+ " and Height " +Height+ " is "  +Area);
	}

}
