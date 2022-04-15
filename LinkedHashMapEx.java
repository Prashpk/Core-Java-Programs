package HashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lh = new LinkedHashMap<>();
		//prints in order
		lh.put(1, "chand");
		lh.put(4, "darshan");
		lh.put(3, "rocky");
		lh.put(8, "car");
		System.out.println(lh);
		
		for(Map.Entry<Integer, String> mp : lh.entrySet()) {
			
			System.out.println(mp.getKey()+ "   " +mp.getValue());			
		}
	}
}
