package Arrays;
import java.util.Random;
/*
 * Print the median of the array
 * Note: Use O(1) space, and less than O(nlogn) time.
 */

/*
 * Median value of a range of values is the mid value of a range of values. Easiest way to get to this is to sort the array and pick the middle element. If the number of elements in the array is odd and the middle two elements if the number of elements in the array is even. However, sorting will mean that you will spend O(nlogn) time. The trick is to get to the median value without needing to sort the entire array.
 * This can be done using the Selection Algorithm. The algorithm uses a concept very similar to Quick Sort.
   Let us walk through the steps

	First, Pick a random Pivot and divide the array in two buckets, LESS and MORE (based on if the value is less than or greater than the pivot)
	and let K be N/2
	if the Less bucket contains more than K elements, then your problem reduces to finding K elements in the Left bucket.
	if the Less bucket contains fewer than K elements (say L), then your problem reduces to finding (K-L)th element from the Larger bucket
 */


public class MedianOfArray {
	
	public static void main(String args[])
	{
		int[] a={1,3,4,6,5,9,10,2,8};
		System.out.println(getMedian(a));
		
	}
	
	public static int getMedian(int[] arr)
	{
		int len=arr.length;
		if(len%2==1)
		{
			return partion(arr,(len-1)/2);
		}else
		{
			int a=partion(arr,(len-2)/2);
			int b=partion(arr,len/2);
			return (a+b)/2;
		}
		

		
	}
	
	public static int partion(int[] arr,int n)
	{
		int left=0;
		int right=arr.length-1;
		Random ran=new Random();
		
		while(right>=left)
		{
			int pivotindex = qucikSelect(arr,left,right,ran.nextInt(right-left+1)+left);
			if(pivotindex==n)
				return arr[pivotindex];
			else if(pivotindex < n)
				left= pivotindex + 1;
			else
				right=pivotindex - 1;
			
		}
		return -1;
	}
	
	public static int qucikSelect(int[] arr,int left,int right,int pivot)
	{
		int pivotval=arr[pivot];
		int storeindex=left;
		swap(arr,pivot,right);
		
		for(int i=left;i<right;i++)
		{
			if(arr[i]<pivotval)
			{
				swap(arr,i,storeindex);
				storeindex++;
			}
		}
		swap(arr, right, storeindex);
		return storeindex;
	}
	public static void swap(int[] arr,int left,int right)
	{
		int temp=arr[right];
		arr[right]=arr[left];
		arr[left]=temp;
	}

}
