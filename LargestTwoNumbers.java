package projects1;
import java.util.Scanner;
public class LargestTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1");
		num1 = sc.nextInt();
		System.out.println("Enter the number 2");
		num2 = sc.nextInt();
		
		
		if(num1>num2) {
			System.out.println(+num1+ " is larger than " +num2);
		}
		else if(num2>num1) {
			System.out.println(+num2+ " is larger than " +num1);
		}
		else {
			System.out.println("Two Numbers Are Equal");
		}

	}

}
