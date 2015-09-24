package Arrays;

import java.util.HashSet;

/*
 * Prints true if all elements are unique, false if not
 */
public class CheckUniqueElemtns {
	
	public static void main(String args[])
	{
		int[] arr={1,2,3,4,5,6,4,2,3,5,5,3};
		if(checkUnique(arr))
			System.out.println("unique");
		else
			System.out.println("duplicate");
	}
	public static boolean checkUnique(int[] arr)
	{
		HashSet<Integer> hs=new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(hs.contains(arr[i]))
				return false;
			else
				hs.add(arr[i]);
		}
		return true;
	}
	
	
	
	
	

}
