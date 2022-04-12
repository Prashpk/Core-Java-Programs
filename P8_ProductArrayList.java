package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;

class product{
	int pid;
	String name;
	float price;
	
	//generate constructor with fields
	public product(int pid, String name, float price) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
	}
	
	//generate setter and getter method
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
public class P8_ProductArrayList {

	public static void main(String[] args) {
		//create an ArrayList which will take product objects
		ArrayList<product> Ap = new ArrayList<>();
		
		//create 4 objects of product
		product ob1 = new product( 1, "soap", 7500f);
		product ob2 = new product( 2, "Rice", 1100f);
		product ob3 = new product( 3, "ghee", 6000f);
		product ob4 = new product( 4, "choc", 2500f);
		
		//add product objects to arraylist
		Ap.add(ob1);
		Ap.add(ob2);
		Ap.add(ob3);
		Ap.add(ob4);
		
		//display using iterator
		Iterator<product> obj = Ap.iterator();
		while(obj.hasNext()) {
			product p = obj.next();
			System.out.println(p.getPid()+ "  " +p.getName()+ "  " +p.getPrice()+ " Rs");
		}
	}
}
