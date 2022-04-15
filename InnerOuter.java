package Projects2;

public class InnerOuter {
	
	
		public static void main(String[] args) {		
			int i,j;
			
			outer:
			for(i=1; i<=5; i++)
			{
				inner://These are called as Labels both inner and outer labels
				for(j=1; j<=5; j++)
				{
					if(i==3)
					{
					break inner;
					}
					System.out.print( " i="+i+" j="+j);
					}
				System.out.println();
				}
		}
		}
