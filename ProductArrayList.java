package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;

class Product{
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
public class ProductArrayList {

	public static void main(String[] args) {
		//create an ArrayList which will take product objects
		ArrayList<Product> Ap = new ArrayList<>();
		
		//create 4 objects of Product
		Product ob1 = new Product( 1, "soap", 7500f);
		Product ob2 = new Product( 2, "Rice", 1100f);
		Product ob3 = new Product( 3, "ghee", 6000f);
		Product ob4 = new Product( 4, "choc", 2500f);
		
		//add product objects to arraylist
		Ap.add(ob1);
		Ap.add(ob2);
		Ap.add(ob3);
		Ap.add(ob4);
		
		//display using iterator
		Iterator<Product> obj = Ap.iterator();
		while(obj.hasNext()) {
			Product p = obj.next();
			System.out.println(p.getPid()+ "  " +p.getName()+ "  " +p.getPrice()+ " Rs");
		}
	}
}
