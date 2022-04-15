package projects1;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		int num,factorial=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = sc.nextInt();
		
	        int i = num;
		while(num>=1) {
			 factorial = factorial * num;
			 num = num-1;
		}
		System.out.println("factorial of a number " +i+ " is "+factorial);

	}

}
