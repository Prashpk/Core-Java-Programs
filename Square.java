package projects1;

import java.util.Scanner;
public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int side,Area;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Side os Square :");
		side = sc.nextInt();
		Area = side * side;
		System.out.println(+side+ "the side of area of Square is " +Area);
	}

}
