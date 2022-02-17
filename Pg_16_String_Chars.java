package Projects2;
import java.util.Scanner;

public class Pg_16_String_Chars {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String name,rev="";
		int i;
		int c = 0;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name :");
		name = sc.nextLine();
		String s1  = name.toLowerCase();
		
		System.out.println("No of characters in string is " +name.length());
		
		for(i=0; i<name.length(); i++) {
			char ch =  s1.charAt(i);
			if(ch == ' '){
				c = c + 1;
			}
		}
		System.out.println("No of Words is " +(c+1));
		
		for(i=0; i<name.length(); i++) {
			char ch =  s1.charAt(i);
			rev = ch + rev;		
		}
		System.out.println("Reversed string is " +rev);

	}

}
