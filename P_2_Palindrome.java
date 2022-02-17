package Projects2;
//Palindrome number in java: 
//A palindrome number is a number that is same after reverse. 
//For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. 

import java.util.Scanner;
public class P_2_Palindrome {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 int digit,num,rev = 0;
	        Scanner sc= new Scanner(System.in); 
	        System.out.println("Enter a number :");
	        num = sc.nextInt();
	        int num1 = num;
	        while(num!=0) {
	        	digit = num%10;
	        	rev = rev*10+digit; 
	        	num = num/10;	
	        }
	        System.out.println("Reversed number is " +rev);
	        
	        if(rev == num1) {
	        	System.out.println("Palindrome");
	        }
	        else {
	        	System.out.println("It is Not a Palindrome!");
	        }
		}

	}
