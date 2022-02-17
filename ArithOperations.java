package projects1;

public class ArithOperations {

	public static void main(String[] args) {
	
		//sum,difference,product,division,reminder;
		int sum,diff,p,q,rem;
		int s1 = 10;
		int s2 = 20;
		
		sum = s1 + s2;
		
		System.out.println("The Sum of " +s1+ " and " +s2+ "= " +sum);
		diff = s1 - s2;
		System.out.println("The Diff of " +s1+ " and " +s2+ "= " +diff);
		p = s1 * s2;
		System.out.println("The Product of " +s1+ " and " +s2+ "= " +p);
		q = s1 / s2;
		System.out.println("The Quotient of " +s1+ " and " +s2+ "= " +q);
		rem = s1 % s2;
		System.out.println("The Reminder of " +s1+ " and " +s2+ "= " +rem);		
	}

}
