package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchingArraylist{

	
	public static void main(String[] args) {
		ArrayList<String> lst=new ArrayList<>();
		String Name;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Names are you Entering");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Enter the Names");
			Name=sc.next();
			lst.add(Name);
		}
		System.out.println("ArrayList Names="+lst);
		
		System.out.println("Enter The Name to search");
		String s=sc.next();
		if(lst.contains(s)) {
			System.out.println(s+" is present in list");
		}else {
			System.out.println(s+" not present in list");
		}
	}

}
