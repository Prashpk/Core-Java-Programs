package p1;
class Addition{
	int i,j,s;
	
	//Constructor
	Addition(){
		//Constructor with no arg
		System.out.println("Constructor is a special type of function");
		System.out.println("No return type");
		System.out.println("Calls automatically on object creation");
		System.out.println("Name of the constructor should be the name of the class");

		i = 10;
		j = 20;
	}
	
	Addition(int k, int l){
		i=k;
		j=l;
	}
	
void add() {
		
		s=i+j;
	}
	
	void disp() {
		System.out.println("Display");
		System.out.println("The sum of "+i+" and "+j+" is "+s);

	}	
}

public class Constructor {

	public static void main(String[] args) {
		
        Addition Add = new Addition();
	System.out.println("i = " +Add.i);
	System.out.println("j = " +Add.j);
        Add.add();
	Add.disp();
	       
	Addition ob1=new Addition(15,67); 
        System.out.println("i="+ob1.i);
        System.out.println("j="+ob1.j);
        ob1.add();
        ob1.disp();
	}
}
