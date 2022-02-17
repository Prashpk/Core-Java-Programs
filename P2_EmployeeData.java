import java.util.Scanner;

class Employee{
	String eName;
	int eId;
	String eDept;
	Float eSalary;
	
	
	@SuppressWarnings("resource")
	void acceptEmployeeData() {	
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
	void HighestEmployeeSalary() {
		
	}

}


public class P2_EmployeeData {

	public static void main(String[] args) {
		
		Employee Emp = new Employee();
		Emp.acceptEmployeeData();
		Emp.DisplayEmployeeData();
		
		Employee Emp1 = new Employee();
		Emp1.acceptEmployeeData();
		Emp1.DisplayEmployeeData();
		
		Employee Emp2 = new Employee();
		Emp2.acceptEmployeeData();
		Emp2.DisplayEmployeeData();
		

	}

}
