package Projects2;
import java.util.Scanner;

public class StringEqualsIgnoreCase {

	public static void main(String[] args) {
		int i;
		String uname,upass;
		Scanner sc=new Scanner(System.in);
		
		for(i=1;i<=3;i++)
		{
		System.out.println("Enter  userName :");
		uname = sc.next();
		System.out.println("Enter  userPassword :");
		upass = sc.next();
		
		if(uname.equalsIgnoreCase("admin") && upass.equals("admin123"))
		{
			System.out.println("Login Succefull!");
			break;
		}
		else {
			
//			System.out.println("Invalid Username & Password!");
			System.out.println(+i+ " Attempts are over!");
			
			if(i==1) {
			System.out.println("Invalid Uname or Pass Try Again!");
			//System.out.println("Invalid Username & Password!");
			//System.out.println(+(i+1)+ " Attempts are left!");
			}
			if(i==2) {
				System.out.println("Invalid Uname or Pass Try Again!");
				//System.out.println("Invalid Username & Password!");
				//System.out.println(+(i-1)+ " Attempts are left!");
				}
			if(i==3) {
				System.out.println("The Heck Three Attempts are Over Buddy!");
				//System.out.println(+(i-i)+ " Attempts left!");
				}
		}
		}
		if(i == 4) {
			System.out.println("Locked! Try again After 24 hours!");
		}
	} 

}
