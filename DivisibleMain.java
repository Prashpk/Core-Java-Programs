//Program to check the given number is divisible by 3 and 5

package projects1;

import java.util.Scanner;
public class DivisibleMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		n = sc.nextInt();
		
		if(n%5==0 && n%3==0) {
			System.out.println("Divisible by 3 and 5");
		}
		else if(n%3==0){
			System.out.println(+n+" is Divisible by only 3");
		}
		else if(n%5==0){
			System.out.println(+n+" is Divisible by only 5");
		}
		else {
			System.out.println("not Divisible by both numbers");
		}

	}

}
