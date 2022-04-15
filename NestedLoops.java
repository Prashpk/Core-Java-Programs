package Projects2;

public class NestedLoops {

	public static void main(String[] args) {
		int i,j;
		
		for(i=4; i>=1; i--)//rows
		{
			for(j=1; j<=i; j++)//cols 
			{
//				System.out.print(i+ " ");
				System.out.print(" *");
			}
			System.out.println(" ");
		}
			for(i=1; i<=4; i++)
			{
				for(j=1; j<=i; j++)
				{
					System.out.print(" *");				
				}
				System.out.println(" ");
		}
		}
}

//OUTPUT:
//* * * * 
//* * * 
//* * 
//* 
//* 
//* * 
//* * * 
//* * * * 
	

