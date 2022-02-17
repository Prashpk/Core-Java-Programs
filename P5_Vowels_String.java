import java.util.Scanner;
//program to remove vowels
public class P5_Vowels_String{

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int i;
		char ch;
		Scanner sc = new Scanner(System.in);
		String ms = "";
		System.out.println("Enter the string :");
		String s = sc.nextLine().toLowerCase();
		
		for( i=0;i<s.length();i++) {
			 ch = sc.next().charAt(0);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				System.out.println(ch);
				continue;
			}
			else
			{
			ms = ms+s.charAt(i);
		    }
		  }
        System.out.println("after removing vowels " +ms);
	}
}
