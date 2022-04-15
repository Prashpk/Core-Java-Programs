import java.util.Scanner;

public class MinimumArrayElements{

	public static void main(String[] args) {
		
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements : ");
		
		//inputting 5 elements
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		//To find minimum number
		int min=a[1];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			
		}
		System.out.println("Least number is "+min);

		//To find maximum number
		int max=a[0];
		for(int i=1;i<a.length;i++) {
		if(a[i]>max)
		{
			max=a[i];
		}
		}
		System.out.println("Maximum Number is "+max);
		
		
		}
   }
