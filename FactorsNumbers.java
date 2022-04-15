package Projects2;
import java.util.Scanner;

public class FactorsNumbers {

	public static void main(String[] args) {
		
		//input =24
		//factors =  1 2 3 4 6 8 12 24
		int num,i,ch;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Enter the Number : ");
		num = sc.nextInt();
		System.out.println("factors of a Number " +num+ " is ");
		
		for(i=1; i<=num;i++){
			
			if(num%i==0) {
				System.out.println(i);
			}
		}
		System.out.println("You Want to Continue 0/1");
		ch = sc.nextInt();
	}
	while(ch!=0);
	}

}
