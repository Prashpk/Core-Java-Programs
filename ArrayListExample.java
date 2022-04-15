package ArrayList;
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> lst = new ArrayList<Integer>();
		//adding to arraylist
		//ArrayList lst = new ArrayList<>();
//		lst.add(45);
//		lst.add("prashanth");
//		lst.add(345.690f);
//		lst.add('A');
		
		//removing from arraylist
//		lst.remove(2);
//		lst.remove(1);
//		lst.remove(0);
		
		lst.add(45);
		lst.add(55);
		lst.add(65);
		lst.add(75);
		lst.add(85);
		System.out.println(lst);
		
		
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(45);
		lst1.add(55);
		lst1.add(65);
		lst1.add(75);
		lst1.add(85);
		lst1.remove(1);
		System.out.println(lst1);
		
		ArrayList<String> ls = new ArrayList<String>();
		ls.add(" prashanth ");
		ls.add(" sandeep ");
		ls.add(" karthi ");
		ls.add(" raghu");
		ls.add(" chandu");
		ls.remove(3);
		System.out.println(ls);
		
		ArrayList<Character> ls1 = new ArrayList<Character>();
		ls1.add('P');
		ls1.add('R');
		ls1.add('A');
		ls1.add('S');
		ls1.add('H');
		ls1.add('K');
		System.out.println(ls1);
		
		ArrayList<Float> ls2 = new ArrayList<Float>();
		ls2.add(550.800f);
		ls2.add(55.678f);
		ls2.add(65.676f);
		ls2.add(75.866f);
		ls2.add(85.6767f);
		//ls2.clear();
		
		System.out.println(ls2);	
	}
}
