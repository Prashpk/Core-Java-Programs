package projects1;
import java.util.Scanner;
public class LargestOfThreeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, num3;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1");
		num1 = sc.nextInt();
		System.out.println("Enter the number 2");
		num2 = sc.nextInt();
		System.out.println("Enter the number 3");
		num3 = sc.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println(+num1+ " is larger than " +num2+ " and " +num3);
		}
		else if(num2>num1 && num2>num3) {
			System.out.println(+num2+ " is larger than " +num1+ " and " +num3);
		}
		else if(num3>num1 && num3>num2) {
			System.out.println(+num3+ " is larger than " +num1+ " and " +num2);
		}
		else {
			System.out.println("All Three Numbers Are Equal");
		}

	}

}
