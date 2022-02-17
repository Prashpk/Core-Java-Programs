package projects1;

import java.util.Scanner;

public class Tea_and_Cofee {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int tea,coffee,quantity,choice,amount;
		char ch;
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("*****MENU*******");
		System.out.println("1.Tea");
		tea = sc.nextInt();
		System.out.println("2.Coffee");
		coffee = sc.nextInt();
		System.out.println("3.Tea and Coffee");
		System.out.println("Please enter your choice : ");
		choice = sc.nextInt();
		System.out.println("Please Enter The Quantity : ");
		quantity = sc.nextInt();
	
		switch(choice){
		case 1:
		   amount =  tea * quantity;
		   System.out.println(amount);
		   break;
		case 2:
			   amount =  coffee * quantity;
			   System.out.println(amount);
			   break;
		case 3:
			System.out.println("1.Tea");
			tea = sc.nextInt();
			System.out.println("2.Coffee");
			coffee = sc.nextInt();
			amount = (tea*coffee)*quantity;
			System.out.println(amount);
		}
		System.out.println("Do you want to Continue? Y/N");
		ch = sc.next().charAt(0);
	    }
       while(ch != 'N');
}
}
