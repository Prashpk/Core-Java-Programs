package HashMap;

import java.util.HashMap;
import java.util.Map;

public class P2_HashMap2 {

	public static void main(String[] args) {
		HashMap<Integer, String> ob = new HashMap<Integer, String>();
		ob.put(10, "ram");
		ob.put(20, "tam");
		ob.put(30, "sam");
		System.out.println("HashMap = " +ob);
		
		//put IfAbsent for puttuing if elements
		ob.putIfAbsent(40,"drama");
		
		System.out.println("after put method");
		System.out.println("HashMap = " +ob);
		
		for(Map.Entry m: ob.entrySet()) {
			System.out.println("hashmap = " +m.getKey()+ " " +m.getValue());
		}	
	}
}
