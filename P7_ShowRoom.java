import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class showroom1{
	String name;
	long mobno;
	double cost;
	double dis;
	double amount;

	void showroom() {
		name = "null";
		mobno = 0;
		cost = 0;
		dis = 0;
		amount = 0;
	}
	
	void input() throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("Enter Name :");
		name = br.readLine();
		System.out.println("Enter mobno :");
		mobno = Long.parseLong(br.readLine());
		System.out.println("Enter Cost of The item :");
		cost = Double.parseDouble(br.readLine());		
	}
	
	void calculate() {
		if(cost<=10000) {
			dis = (cost*5)/100;
		}
		else if(cost>10000 && cost <=20000) {
			dis = (cost*10)/100;
		}
		else if(cost>20000 && cost<=35000) {
			dis = (cost*15)/100;
		}
		else {
			dis = (cost*20)/100;
		}
		System.out.println("Amount after discount is " +dis);
		amount = cost - dis;
}
	void display(){
		System.out.println("customer name = " +name);
		System.out.println("cust mobno is = " +mobno);
		System.out.println("Amount to be paid after discount = " +amount+" Rs");
	}
}
public class P7_ShowRoom {
	public static void main(String[] args) throws IOException {
		showroom1 sr = new showroom1();
		sr.input();
		sr.calculate();
		sr.display();
	}
}
