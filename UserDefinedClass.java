package HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

class Car{
	int id;
	String name;
	String Color;
	String Brand;
	float price;
	
	public Car(int id, String name, String color, String Brand, float price) {
		this.id = id;
		this.name = name;
		this.Color = color;
		this.Brand = Brand;
		this.price = price;
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

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}	
}

public class UserDefinedClass {

	public static void main(String[] args) {
		LinkedHashMap<Integer, Car> cl = new LinkedHashMap<> ();
		Car cr = new Car(7,"suzuki","Red","TATA",300000f);
		Car cr2 = new Car(8,"maruthi","blue","Ferari",4000000f);
		Car cr3 = new Car(4,"atlas","green","Benz",500000f);
		Car cr4 = new Car(3,"toyo","violet","tesla",700000f);
		
		cl.put(1, cr2);
		cl.put(2, cr);
		cl.put(3, cr3);
		cl.put(4, cr4);
		
		for(Map.Entry<Integer, Car> mc : cl.entrySet() ) {
			int k = mc.getKey();
			Car c = mc.getValue();
			System.out.println(c.getId() + "  " +c.getName() + "  " +c.getColor() + "  " +c.getBrand()+ "  "+ c.price);
		}
	}
}
