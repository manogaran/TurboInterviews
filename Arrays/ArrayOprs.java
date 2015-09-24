package Arrays;

/*
 * Write a method that accepts an array of integers and
1. Print the sum of all elements?
2. Print the arithmetic mean of the array?
3. Print the largest element in the array?
4. Print the smallest element in the array?
 */
public class ArrayOprs {
	
	public static void main(String args[])
	{
		int[] arr={1,2,3,4,5};
		sumOfElements(arr);
		printArry(arr);
		printLargest(arr);
		printSmallest(arr);
	}
	/*
	 *  Print the sum of all elements
	 * 
	 */
	public static void sumOfElements(int[] arr)
	{
		if(arr==null || arr.length==0)
		{
			System.out.println("input array is empty");
		}
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		
		System.out.println("Sum of the given array is "+sum);
			
	}
	
	/*
	 * Print the arithmetic mean of the array
	 */
	
	public static void printArry(int[] arr)
	{
		if(arr==null || arr.length==0)
		{
			System.out.println("input array is empty");
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	
	/*
	 * Print the largest element in the array
	 * 
	 */
	
	public static void printLargest(int[] arr)
	{
		if(arr==null || arr.length==0)
		{
			System.out.println("input array is empty");
		}
		
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		
		System.out.println("Largest Element in array "+max);
	}
	
	/*
	 * Print the smallest element in the array
	 * 
	 */
	
	public static void printSmallest(int[] arr)
	{
		if(arr==null || arr.length==0)
		{
			System.out.println("input array is empty");
		}
		
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
				min=arr[i];
		}
		
		System.out.println("Smallest Element in array "+min);
	}
	

}
