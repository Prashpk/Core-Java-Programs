package projects1;
import java.util.Scanner;
public class Average_marks {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1,s2,s3,s4,s5;
		float avg;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("First subject marks");
		s1 = sc.nextInt();
		System.out.println("Second subject marks");
		s2 = sc.nextInt();
		System.out.println("Third subject marks");
		s3 = sc.nextInt();
		System.out.println("Fourth subject marks");
		s4 = sc.nextInt();
		System.out.println("Fifth subject marks");
		s5 = sc.nextInt();
		
		avg = (s1 + s2 + s3 + s4 + s5)/5;
		System.out.println("Average marks is " +avg);
		
		

	}

}
