import java.util.Scanner;

public class SumArrayElements {

	public static void main(String[] args) {
		int i;
		int arr[] = new int[5];
		int sum = 0;
		float avg;
		
	   Scanner sc = new Scanner(System.in);	
       System.out.println("Enter the Numbers :");
       
       for(i=0;i<arr.length;i++) {
    	   arr[i] = sc.nextInt(); 
       }
       
       System.out.println("Array elements are ");
       for(i=0;i<arr.length;i++) {
    	   System.out.println(arr[i]);
       }
   
       for(i=0;i<arr.length;i++) {
    	   sum = sum + arr[i];
//    	   System.out.println("sum = " +sum);
       }
       System.out.println("sum =" +sum);
// 
       avg = (float)sum/arr.length;
       System.out.println("The average is " +avg);

	}

}
