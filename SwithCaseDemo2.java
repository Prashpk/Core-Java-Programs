package projects1;

import java.util.Scanner;

public class SwithCaseDemo2 {

	public static void main(String[] args) {
		char vowel;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		vowel = sc.next().charAt(0);
		
		switch(vowel) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			
			System.out.println("vowel");
			break;
			
		default:
			System.out.println("not an vowel");
		}

	}

}
