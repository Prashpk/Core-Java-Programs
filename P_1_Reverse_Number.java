package Projects2;
import java.util.Scanner;

public class P_1_Reverse_Number {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
        int digit,num,rev = 0;
        Scanner sc= new Scanner(System.in); 
        System.out.println("Enter a number :");
        num = sc.nextInt();
//      input = 123 
//      System.out.println("Before While number " +num);
//      num1 = num;
        while(num!=0) {
        	digit = num%10;
        	rev = rev*10+digit;            //3, 3*10+2 =32,  32*10+1 = 321;
        	                               //System.out.println(digit);
        	num = num/10;	
        }
        System.out.println("Reversed number is " +rev);
        
	}

}
/*          input =123  &&  output = 321
            digit = num%10;              //digit = 3
            System.out.println(digit);
            num = num/10;
            
            digit = num%10;
            System.out.println(digit);
            num = num/10;
            
            digit = num%10;
            System.out.println(digit);
            num = num/10;
*/