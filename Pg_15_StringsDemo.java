package Projects2;
import java.util.Scanner;

public class Pg_15_StringsDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String name;
		int i;
		int c = 0;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name :");
		name = sc.nextLine();
		String s1  = name.toLowerCase();
		
		System.out.println("No of cahracters is " +name.length());
		
		for(i=0; i<name.length(); i++) {
			char ch =  s1.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				c =c + 1;
			}
		}
		
		System.out.println("No of ovels is " +c);

	}

}
