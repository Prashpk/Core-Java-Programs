
public class ArrayDemo {

	public static void main(String[] args) {
		int i;		
		int arr[] = {1,2,3,4,5,6};		
//		System.out.println("First Element =" +arr[0]);
//		System.out.println("First Element =" +arr[1]);
//		System.out.println("First Element =" +arr[2]);
//		System.out.println("First Element =" +arr[3]);
//		System.out.println("First Element =" +arr[4]);
//		System.out.println("First Element =" +arr[5]);
		//using for loop
		
		for(i=0;i<arr.length;i++)
		{
			System.out.println("index " +i+ " Elements are = " +arr[i]);
			//System.out.println(+arr[i]);
		}
	
		System.out.println("Array Reverse order :");
		for(i=arr.length-1;i>=0;i--) {
			System.out.println("Reverse Elements are = " +arr[i]);
		}

	}

}
