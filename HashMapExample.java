package HashMap;
import java.util.HashMap;
import java.util.Map;

class Book{
	int bid;
	String bname;
	String aname;
	float price;
	public Book(int bid, String bname, String aname, float price) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.aname = aname;
		this.price = price;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override  //Object class
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", aname=" + aname + ", price=" + price + "]";
	}
	
	
}

public class HashMapExample {
public static void main(String[] args) {
		HashMap<Integer,Book> mp=new HashMap<>();
		Book b1=new Book(11,"Java Complete Ref","Games",500f);
		Book b2=new Book(12,"C programming","John",300f);
		Book b3=new Book(13,"Oracle sql","Peter",600f);
		
		mp.put(1, b1);
		mp.put(2, b2);
		mp.put(3, b3);
		
		System.out.println(mp);

		//traversing
		//Map.Entry
		for(Map.Entry<Integer, Book>me  : mp.entrySet()) {
			int k=me.getKey();
			Book b=me.getValue();
			System.out.println(b.getBid()+" "+b.getBname()+" "+b.getAname()+" "+b.getPrice());
			
		}
	}

}
