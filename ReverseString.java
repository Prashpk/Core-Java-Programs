package Projects2;
import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		String s=" ",rev=" ";
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name :");
		s = sc.nextLine();
		
		//Another method
		//string lenth 5-1 printing 4th index first then continuing..
		//length of string
		for(i=s.length()-1; i>=0; i--) {
			char ch =  s.charAt(i);
			rev = rev + ch;		
		}
		System.out.println("Reversed string is " +rev);
	}

}
