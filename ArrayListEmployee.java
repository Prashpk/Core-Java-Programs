package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;

class Employee{
	int id;
	String name;
	float salary;
	String designation;
	public Employee(int id, String name, float salary, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	
}

public class ArrayListEmployee {

	public static void main(String[] args) {
		ArrayList<Employee> list= new ArrayList<>();
		Employee ob1 = new Employee(1,"prash",300000f, " developer ");
		Employee ob2 = new Employee(2,"sam",28000f, " designer ");
		Employee ob3 = new Employee(3,"karthik",50000f, " engineer ");
		list.add(ob1);
		list.add(ob2);
		list.add(ob3);
		
		Iterator<Employee> sit = list.iterator();
		while(sit.hasNext()) {
			Employee s= sit.next();
			System.out.println(s.getId() +" "+s.getName()+" "+s.getSalary() +s.getDesignation());
		}	
	}
}
