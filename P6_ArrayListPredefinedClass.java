package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;

class student{
	int id;
	String name;
	float fees;
	
	public student(int id, String name, float fees){
		super();//refer parent class objects 
		this.id = id;//this reference to current obj
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

public class P6_ArrayListPredefinedClass {

	public static void main(String[] args) {
		ArrayList<student> li= new ArrayList<>();
		student ob1 = new student(1,"prash",3466.54f);
		student ob2 = new student(1,"sam",2455.54f);
		student ob3 = new student(1,"karthi",1567.54f);
		li.add(ob1);
		li.add(ob2);
		li.add(ob3);
		
		Iterator<student> sit = li.iterator();
		while(sit.hasNext()) {
			student s= sit.next();
			System.out.println(s.getId() +" "+s.getName()+" "+s.getFees());
		}
			
	}
}
