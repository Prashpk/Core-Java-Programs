package HashMap;

import java.util.Map;
import java.util.TreeMap;


class Books{
	int id;
	String BookName;
	String AuthorName;
	Float Price;
	
	public Books(int id, String BookName, String AuthorName,Float Price) {
		this.id = id;
		this.BookName = BookName;
		this.AuthorName =AuthorName;
		this.Price = Price;
	}
	
	public void setId() {
		this.id=id;
	}
	
	public int getId(){
		return id;
	}
	
	public void setBookName() {
		this.BookName = BookName;
	}
	public String getBookName() {
		return BookName; 
	}
	public void setAuthorName() {
		this.AuthorName = AuthorName;
	}
	public String getAuthorName() {
		return AuthorName; 
	}
	public void setPrice() {
		this.Price = Price;
	}
	public Float getPrice() {
		return Price;
	}
	
}



public class TreeMap {

	public static void main(String[] args) {
		TreeMap<Integer, Books> tm = new TreeMap<>();
		
		Books b = new Books(1, "c programming", "Dennis", 3400f);
		Books b1 = new Books(2, "python programming", "Mark", 4400f);
		Books b2= new Books(3, "java programming", "SunMicro", 5400f);
		
		tm.put(1,b);
		tm.put(2,b1);
		tm.put(3,b2);
		
		System.out.println(tm);
		
		for(Map.Entry<Integer,Books>mp: tm.entrySet()) {
			int k = mp.getKey();
			Books B = mp.getValue();
			System.out.println(B.getId()+" " +B.getBookName()+ " " +B.getAuthorName()+ " " +B.getPrice());
		}
	}
}
