import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class railwayticket{
	String name;
	String coach;
	long mobno;
	int amount;
	int totalamount;
      void accept() throws IOException {
    	   InputStreamReader is = new InputStreamReader(System.in);
    	   BufferedReader br = new BufferedReader(is);
    	   System.out.println("Enter your name : ");
    	   name = br.readLine();
    	   System.out.println("Enter your coach name : ");
    	   coach = br.readLine();
    	   System.out.println("Enter mobno : ");
    	   mobno = Long.parseLong(br.readLine());
           System.out.println("Enter Amount : ");
           amount = Integer.parseInt(br.readLine());	   
      }
      
	void update() {
		if(amount==700) {
		}
		else if(amount==500) {
		}
		else if(amount==250) {
		}
		else {
			System.out.println("none");	
		}
		System.out.println("The amount for the coach " +coach+ " is " +amount);
		totalamount=amount;
	}
	void display(){
		System.out.println("*********** Details of Customer ********");
		System.out.println("name = " +name);
		System.out.println("coach = " +coach);
		System.out.println("mobno = " +mobno);
		System.out.println("total amount = " +totalamount);
	}	
}
public class P8_RailwayTicket {
	public static void main(String[] args) throws IOException {
		railwayticket rt = new railwayticket();
		rt.accept();
		rt.update();
		rt.display();
	}
}
