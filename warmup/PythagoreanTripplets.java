package warmup;

/*
 *  Write an algorithm to find all the Pythagorean triples a,b,c such that 1<=a<b<c<=1000.
 *  Note: Pythagorean Triplets are of the the form a2 +b2 =c2
 */
public class PythagoreanTripplets {
	
	public static void main(String args[])
	{
		print(100);
		printImproved(100);
	}
	
	public static void print(int num)
	{
		int count =0;
		for(int i=3;i<=num;i++)
		{
			stmt:
			for(int j=2;j<i;j++)
			{
				
				for(int k=1;k<j;k++)
				{
					if((k*k)+(j*j)==(i*i))
					{
						System.out.println("a = "+k+", b = "+j+", c = "+i);
						count++;
						continue stmt;
					}
					//System.out.println("i= "+i+",j= "+j+",k=" +k);
				}
			}
		}
		
		System.out.println("Total number of Tripplets "+count);
	}
	
	//
	
	public static void printImproved(int num)
	{
		int count =0;
		for(int i=3;i<=num;i++)
		{
			stmt:
			for(int j=i-1;j>0;j--)
			{
				
				for(int k=j-1;k>0;k--)
				{
					if((k*k)+(j*j)==(i*i))
					{
						System.out.println("a = "+k+", b = "+j+", c = "+i);
						count++;
						continue stmt;
					}
					//System.out.println("i= "+i+",j= "+j+",k=" +k);
				}
			}
		}
		
		System.out.println("Total number of Tripplets "+count);
	}
	
	
	

}
