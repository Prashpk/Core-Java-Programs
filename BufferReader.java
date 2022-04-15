//Encapsulation Example
//Encapsulation in Java is a mechanism of wrapping the data (variables) and 
//code acting on the data (methods) together as a single unit. 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class School{
	int sid;
	String name;
	float amount;
	
	void input() throws IOException {
		//InputStreamReader reads bytes from the input stream as characters.
		//BufferReader Reads text from a character-input stream, buffering characters 
		//so as to provide for the efficient reading of characters, arrays, and lines. 
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		System.out.println("Enter school id ");
		sid = Integer.parseInt(br.readLine());
		System.out.println("Enter school name");
		name = br.readLine();
		System.out.println("Total Fees ");
		amount = Float.parseFloat(br.readLine());
	}

void display() {
	System.out.println(" school id = " +sid);
	System.out.println(" Name = " +name);
	System.out.println(" Total fees Collected = " +amount);
}
}
public class BufferReader {
	public static void main(String[] args) throws IOException{
		School st = new School();
		st.input();
		st.display();		
	}
}
