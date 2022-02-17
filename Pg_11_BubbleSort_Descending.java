package Projects2;
import java.util.Scanner;

public class Pg_11_BubbleSort_Descending {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
	int i,j,temp,a[],n;
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter the array size:");
    n = sc.nextInt();
    a = new int[n];
    
    for(i=0;i<a.length;i++) {
        //System.out.println("Enter the array Elements:");
    	a[i] = sc.nextInt();
    } 
    System.out.println("Before Sorting array Elements:");
    for(i=0;i<a.length;i++) {
    	System.out.println(a[i]);

    }
    
    for(i=0; i<a.length-1; i++)
    {
    	for(j=0; j<a.length-1-i; j++)
    	{
    		if(a[j] < a[j+1]) {
    			temp = a[j];
    			a[j] = a[j+1];
    			a[j+1] = temp;
    		}
    	}
    System.out.println("After Sorted array Elements Are:" );
    for(i=0;i<a.length;i++){
    System.out.println(a[i]);
    }
  }
}
}
