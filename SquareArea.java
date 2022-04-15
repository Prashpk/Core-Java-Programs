package projects1;

import java.util.Scanner;
public class SquareArea {

	public static void main(String[] args) {
		int side,Area;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Side os Square :");
		side = sc.nextInt();
		Area = side * side;
		System.out.println(+side+ "the side of area of Square is " +Area);
	}

}
