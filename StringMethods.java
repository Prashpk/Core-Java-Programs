//M.k.Gandhi
public class StringMethods {

	public static void main(String[] args) {
		String s = "Mohandas Karamchand Gandhi";
		System.out.println(s.indexOf(" "));
		System.out.println(s.lastIndexOf(" "));
		int li = s.lastIndexOf(" ");
		System.out.println(s.substring(li+1));
		System.out.println(s.substring(0,li));
		
		System.out.print(s.substring(li+1));
		System.out.print(" ");//adding space
		System.out.println(s.substring(0,li));
		
		System.out.print(s.charAt(0));
		System.out.print(".");
		System.out.print(s.charAt(9));
		System.out.print(".");
		System.out.print(s.substring(li+1));
		
		//int sp = s.indexOf(" ");
		//String s1 = s.charAt(0)+"."+s.charAt(9)+"."+s.substring(li+1);
	}
	}
