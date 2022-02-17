package projects1;

public class SimpleInterest {

	public static void main(String[] args) {
		float SI,P,R,T;
		
		P = 4500;  //PRINCIPAL
		T = 3;     //TIME PERIOD
		R = 8;     //RATE OF INTEREST
		
		SI = (P*R*T)/100;
		System.out.println("simple interest of principle " +P+ 
				           " for years of " +T+ 
				           " at the rate of " +R+ 
				           " is " +SI);
	}
}
