import java.util.Scanner;

class Transport1{
	//member variables
	String name;
	int w;
	int charge;
	
	Scanner sc = new Scanner(System.in);
	void accept() {
		System.out.println("Enter customer name : ");
		name = sc.nextLine();
		System.out.println("Enter weight of the parcel  : ");
		w = sc.nextInt();
		
	}
	void calculate() {
		if(w<=10) {
			charge = w *25;
		}
		else if(w>10 && w<=30) {
			charge = 10*25 + (w-10) * 20;
		}
		else if(w>30) {
			charge = 10 *25 + 20 * 20 + (w-30) * 10;
		}
		else {
			System.out.println("Invalid!!");
		}
		//System.out.println("The charge is " +charge);
	}
	
	void print() {
		System.out.println("name\tweight\tbillamount\t");
		//System.out.println("Name\t" + "Weight\t" + "Bill Amount\t");
		System.out.println("-----------\t-------\t---------\t");
		//System.out.println("---------\t" + "-----------\t" + "------------------\t");
		System.out.println(name+"\t" +w+".kg\t" +(charge+(charge*0.05))+"\t");
	}
}

public class TransportCompany {
	public static void main(String[] args) {
		Transport1 at = new Transport1();
		at.accept();
		at.calculate();
		at.print();
	}
}
