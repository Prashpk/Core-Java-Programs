
//Program to CAlculate the Discount and Amount final price

package projects1;

import java.util.Scanner;
public class Discount {
	public static void main(String[] args) {
		
		float Discount_amount,rate; 
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rate of the product ");
		rate = sc.nextFloat();
		
		if(rate>=1000 && rate <=2000) {
			Discount_amount = (rate*2)/100;
		
		}
		else if(rate>=2001 && rate <=4000) {
			Discount_amount = (rate*3)/100;
		
		}
		else if(rate>=4001 && rate <=6000) {
			Discount_amount = (rate*4)/100;
		
		}
		else{
			Discount_amount = (rate*5)/100;
		
		}
		System.out.println("Discount_amount is " +Discount_amount);
		System.out.println("Amount to be paid after discount calculated is " +(rate-Discount_amount));

	}

}
//amount is Final price &
//rate is the Current price of item  
