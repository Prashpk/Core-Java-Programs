package Projects2;
import java.util.Scanner;

public class P_4_Sum_Of_Individual_Number {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int num, digit, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		num = sc.nextInt();
		
		while(num>0) {
			digit = num%10;
			sum = sum + digit;
			num = num/10;
		}
		System.out.println("The sum of Numbers is " +sum);

	}

}
