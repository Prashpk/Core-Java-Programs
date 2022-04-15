import java.util.Scanner;

public class ReplaceString {

		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string :");
			String str = sc.nextLine();
			
			System.out.println("Enter the character you want to be replaced?");
			char c = sc.next().charAt(0);
			System.out.println("Enter the character to be replaced with?");
			char r = sc.next().charAt(0);
			String replacestring = str.replace(c,r);
			System.out.println(replacestring);
	}

}
