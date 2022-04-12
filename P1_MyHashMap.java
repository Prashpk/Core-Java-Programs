package HashMap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class P1_MyHashMap {

	public static void main(String[] args) {
		// HashMap<Key, Value>
		HashMap<Integer, String> ob = new HashMap<Integer, String>();
		//printing not in order
		//it wont print Duplicate values
		ob.put(10, "ram");
		ob.put(10, "ram");
		ob.put(10, "ram");
		ob.put(20, "shyaam");
		ob.put(40, "boom");
		ob.put(30, "dam");
		ob.put(70, "tom");
		System.out.println("HashMap = " +ob);
		//another method remove based on key
		//ob.remove(10);
		System.out.println("Prints after remove");
		//map
		for(Map.Entry<Integer,String> m: ob.entrySet()) {
			System.out.println("hashmap = " +m.getKey()+ " " +m.getValue());
		}
		
		
		LinkedHashMap<Integer, String> ob1 = new LinkedHashMap<Integer, String>();
		//printing in order not in sorting order
		ob1.put(1, "ram");
		ob1.put(2, "shyaam");
		ob1.put(4, "boom");
		ob1.put(3, "dam");
		ob1.put(7, "tom");
		System.out.println("LinkedHashMap  = " +ob1);
		
		for(Map.Entry<Integer,String> m1: ob1.entrySet()) {
			System.out.println("Linkedhashmap = " +m1.getKey()+ " " +m1.getValue());
		}
		
		
		TreeMap<Integer, String> ob2 = new TreeMap<Integer, String>();
		//default sorting so prints in ascending order
		ob2.put(10, "ram");
		ob2.put(20, "shyaam");
		ob2.put(40, "boom");
		ob2.put(30, "dam");
		ob2.put(70, "tom");
		System.out.println("TreeMap  = " +ob2);
		
		for(Map.Entry<Integer,String> m1: ob2.entrySet()) {
			System.out.println("Treemap = " +m1.getKey()+ " " +m1.getValue());
		}
			
		Hashtable<Integer, String> ob3 = new Hashtable<Integer, String>();
		//printing not order
		ob3.put(1, "ram");
		ob3.put(70, "shyaam");
		ob3.put(40, "boom");
		ob3.put(60, "dam");
		ob3.put(2, "tom");
		System.out.println("Hashtable  = " +ob3);
		
		for(Map.Entry<Integer,String> m1: ob3.entrySet()) {
			System.out.println("Hashtable = " +m1.getKey()+ " " +m1.getValue());
		}
			
		//print 10 digit phone no in class
//		LinkedHashMap<Long, String> obj = new LinkedHashMap<Long, String>();
//		obj.put(9113268921, "rama"); //The literal 9113268921 of type int is out of range 
	
		
		LinkedHashMap<String, String> obj = new LinkedHashMap<String, String>();
		obj.put("9113268921", "rama"); 
		System.out.println("LinkedHashMap  = " +obj);
	}
}
