package LinkedList;
import java.util.Iterator;
import java.util.LinkedList;

public class P6_MyLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer>listob=new LinkedList<Integer>();
		System.out.println(listob);
		
		listob.add(45);
		listob.add(48);
		listob.add(23);
		listob.add(89);
		System.out.println(listob);
		
		listob.addFirst(100);
		System.out.println(listob);
		listob.addLast(300);
		System.out.println(listob);
		
		System.out.println(listob.get(2));
	    System.out.println(listob.isEmpty());
	    //to get part of linkedlist
	    System.out.println("sublist= "+listob.subList(2, 4));
	    listob.add(2, 32);
	    System.out.println("after adding element in second position "+listob);
	    
	    System.out.println(listob);
	    
	    //Iteration
	    Iterator<Integer> it=listob.iterator();
	    System.out.println("LinkedList elements using iterator");
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    }
}
}