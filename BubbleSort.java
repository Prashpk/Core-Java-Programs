
class BubbleSort{
	static void Ascending(int arr[]) {
		int i,j;
		int n = arr.length;
		int temp = 0;
		for(i=0;i<n;i++) {
			for(j=1;j<(n-i);j++) {
				if(arr[j-1]>arr[j]) {
					temp = arr[j-1];
					arr[j-1]= arr[j];
					arr[j] = temp;
				}
			}
		}
		}
	public static void main(String[] args) {
		 int arr[] = {12,1,2,34,566,745};
		    System.out.println("Array on which we apply Bubble Sort: ");
		    for (int i = 0; i < arr.length; i++) {
		      System.out.print(arr[i] + " ");
		    }
		    System.out.println();
		    Ascending(arr); //Applying Bubble sort to sort the Array  
		    System.out.println("Array after applying Bubble Sort: ");
		    for (int i = 0; i < arr.length; i++) {
		      System.out.print(arr[i] + " ");
		    }
		  }
	}

