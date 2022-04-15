//userDefined class
package LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

class student{
	int id;
	String name;
	float fees;
	public student(int id, String name, float fees){
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	
}

public class VectorStudent {

	public static void main(String[] args) {
		Vector<student> li= new Vector<>();
		student ob1 = new student(1,"prash",3466.54f);
		student ob2 = new student(4,"sam",2455.54f);
		student ob3 = new student(3,"karthi",1567.54f);
		li.add(ob1);
		li.add(ob2);
		li.add(ob3);
		//System.out.println(li);
		
		
		Iterator<student> sit = li.iterator();
		while(sit.hasNext()) {
			student s= sit.next();
			System.out.println(s.getId() +" "+s.getName()+" "+s.getFees());
		}	
	}
}
