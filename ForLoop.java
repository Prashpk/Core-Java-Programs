package projects1;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		int num,fact= 1, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num = sc.nextInt();
		i = num;
		
		for(num=i; num>=1; num--) {
			fact = fact * num;
		}
		System.out.println("factorial of number = " +i+ " is "+fact);
	}
}
