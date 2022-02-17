
public class P6_String_Buffer_Loader {

	public static void main(String[] args) {
//		String s = "Hello";
		
		//string buffer takes string as an argument
		StringBuffer b = new StringBuffer("Hello");
		//hello is an arguement or parameters.
		
//		b.insert(2, "hi");
		b.insert(2, "India");
		System.out.println("After insert " +b);
		
		 b.append("hi");
//        b.append("Bangalore");
        System.out.println("Afetr append " +b);
        
        b.replace(3,4,"how are you?");
        System.out.println("After replace " +b);
        
        b.reverse();
        System.out.println("After reverse " +b);
        
        b.delete(3, 5);
        System.out.println("After delete " +b);
        //perticular character to delete
        b.deleteCharAt(3);
        System.out.println(b);
	}

}
