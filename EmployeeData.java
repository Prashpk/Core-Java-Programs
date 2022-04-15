import java.util.Scanner;

class Employee{
	String eName;
	int eId;
	String eDept;
	Float eSalary;
	
	void AcceptEmployeeData() {	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name :");
		eName = sc.nextLine();
		
		System.out.println("Enter Employee id :");
		eId = sc.nextInt();
		
		System.out.println("Enter Employee Department :");
		eDept = sc.next();
		
		System.out.println("Enter your Salary :");
		eSalary= sc.nextFloat();
	}
	
	void DisplayEmployeeData() {
		System.out.println("EName = " +eName);
		System.out.println("Eid = " +eId);
		System.out.println("EDept = " +eDept);
		System.out.println("ESalary = " +eSalary);
	}
}

public class EmployeeData {

	public static void main(String[] args) {
		
		Employee Emp = new Employee();
		Emp.AcceptEmployeeData();
		Emp.DisplayEmployeeData();
		
		Employee Emp1 = new Employee();
		Emp1.AcceptEmployeeData();
		Emp1.DisplayEmployeeData();
		
		Employee Emp2 = new Employee();
		Emp2.AcceptEmployeeData();
		Emp2.DisplayEmployeeData();	
	}
}
