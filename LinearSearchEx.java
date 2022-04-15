import java.util.Scanner;

public class LinearSearchEx {

	public static void main(String[] args) {
		int i,num,item;
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter number of elements in array:");
	     num = sc.nextInt();
	     
	     int arr[] = new int[num];
	     
	     for (i = 0; i < num; i++) {
	         arr[i] = sc.nextInt();
	     }
	       System.out.println("Enter the search value:");
	       item = sc.nextInt();
	       
	       for (i = 0; i < num; i++)
	       {
	          if (arr[i] == item) 
	          {
	            System.out.println(item+" is present at location "+(i+1));
	            break;
	          }
	       }
	       if (i == num)
	         System.out.println(item + " doesn't exist in array.");
	    }
}
/*Item is found so to stop the search and to come out of the 
 * loop use break statement.*/
