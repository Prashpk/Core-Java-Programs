
//LinkedList is used for manupulating the data in list
package LinkedList;

import java.util.Iterator;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> listob = new LinkedList<>();
		listob.add(45);
		listob.add(55);
		listob.add(66);
		listob.add(77);
		System.out.println(listob);
		
		listob.addFirst(100);
		System.out.println(listob);
		listob.addLast(300);
		System.out.println(listob);
		
		System.out.println(listob.getFirst());
		System.out.println(listob.getLast());
		System.out.println(listob.get(2));
		System.out.println(listob.isEmpty());
		
		System.out.println(listob);

        Iterator<Integer> iter = listob.iterator();
        
        while(iter.hasNext()) {
        	System.out.println(iter.next());
        }		
	}
}
