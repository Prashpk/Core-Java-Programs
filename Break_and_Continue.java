
//Program to check given number is Even or not
package projects1;

import java.util.Scanner;

public class Break_and_Continue {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int i,num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num = sc.nextInt();
		
		for(i = num; i<= 100; i++)
		{
			if(i%2!=0) {
				continue;
			}
			else if(i%2==0){
			}
			System.out.println(i);
				
			}
			
		}

	}

