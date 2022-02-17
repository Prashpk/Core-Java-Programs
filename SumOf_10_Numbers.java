// Program to sum of 10 natural numbers ?
package projects1;

public class SumOf_10_Numbers {

	public static void main(String[] args) {
		int sum = 0;
		int i;
		
		i= 1;
		
		while(i <= 100) {
			
			sum = sum + i;
			i = i+2;
		}
		System.out.println(sum);
	}

}
