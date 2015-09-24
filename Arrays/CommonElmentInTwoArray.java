package Arrays;
/*
 * Given two sorted arrays, find a common element between them?
 */
public class CommonElmentInTwoArray {

	public static void main(String args[])
	{
		int[] a={1,3,5,7,9,11};
		int[] b={2,4,5,8,10,11};
		printCommon(a,b);
	}
	
	public static void printCommon(int[] a,int[] b)
	{
		if((a==null || a.length==0) || (b==null || b.length==0))
				System.out.println("There is no common Elements");
		
		int i=0;
		int j=0;
		while(i<a.length && j< b.length)
		{
			if(a[i]<b[j])
			{
				i++;
			}else if(a[i]>b[j])
			{
				j++;
			}
			else
			{
				System.out.println(a[i]);
				i++;
				j++;
				
			}
		}
	}
}
