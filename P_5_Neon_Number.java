package Projects2;
import java.util.Scanner;

public class P_5_Neon_Number {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int n,square,digit,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		n = sc.nextInt();
		
		square = n*n;
		
		while(square!=0) {
			digit = square%10; //rem =1,8
			sum = sum + digit; 
			square = square/10; //sq=8,0
		}
		if(sum==n) {
			System.out.println(n+ " Neon number");
		}
		else {
			System.out.println(n+ " Not a neon number");
		}

	}

}
