package Arrays;

import java.util.HashSet;
/*
 * 
 * Find the first repeating element in the array
 */
public class FirstRepeatingElement {
	
	public static void main(String args[])
	{
		int[] a={1,2,3,1,4,5,4,3};
		System.out.println(firstRepeatNumber(a));
	}
	
	public static int firstRepeatNumber(int[] arr)
	{
		int repeating=0;
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=arr.length-1;i>=0;i--)
		{
			if(set.contains(arr[i]))
				repeating=arr[i];
			else
				set.add(arr[i]);
				
		}
		return repeating;
		//return -1;
		
	}

}
