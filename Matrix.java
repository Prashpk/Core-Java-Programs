package Projects2;
//TWoDimensional Array example Matrix

import java.util.Scanner;
public class Matrix {

	public static void main(String[] args) {
		int r,c,m,n;
		int a[][] = new int [3][3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Rows :");
		m = sc.nextInt();
		System.out.println("Enter the number of Columns :");
		n = sc.nextInt();
		System.out.println("Enter " +m+ " X " +n+ " matrix: ");
		
		for(r=0;r<m;r++) {
			for(c=0;c<n;c++) {
				a[r][c]=sc.nextInt();
			}
		}
		
		System.out.println("Entered matrix is");
		for(r=0;r<m;r++) {
			for(c=0;c<n;c++) {
				System.out.print(a[r][c]+ "  ");
			}
			System.out.println();
		}
		
		
	}

}
