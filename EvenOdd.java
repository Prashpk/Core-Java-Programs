package projects1;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		number = sc.nextInt();
		if(number == 0) {
			System.out.println("The number is neither even nor Odd ");
		}
		else if(number%2 == 0) {
			System.out.println(+number+ " is Even");
		}
		else {
			System.out.println(+number+ " is Odd");
		}
	}
}
