import java.util.Scanner;

public class P2_Arrays {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	 int i;
	 int arr[] = new int[5];
	 //datatype identifier = new datatype[size]
	
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the Array Elements :");
	 //input array elements
	 for(i=0;i<arr.length;i++)
	 {
		 arr[i] = sc.nextInt();
	 }
	 
	 //Display array elements
	 System.out.println("Array Elements are : "); 
	 for(i=0;i<arr.length;i++)
	 {
		 System.out.println(arr[i]); 
	 }
	
	}
}
	
