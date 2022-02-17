import java.util.Scanner;

public class P2_string {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String s;
		int c = 0;
		System.out.println("Enter the string");
		//s = sc.nextLine();
		s = sc.nextLine().toLowerCase();
		System.out.println("Enter the character");
		char ch = sc.next().charAt(0);
		
		for(int i=0;i<s.length();i++)
		{
			if(ch==s.charAt(i)) {
				c++;
			}
		}
		System.out.println(ch+ " character present at " +c+ " times");

	}

}
