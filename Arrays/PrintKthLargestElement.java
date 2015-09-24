package Arrays;

import java.util.Random;
/*
 * Prints the fourth largest/Smallest element in the array
 */
public class PrintKthLargestElement {
	
	public static void main(String args[])
	{
		int[] a={1,3,4,6,5,9,10,2,8};
		int k=3;
		boolean isSmall=true;
		System.out.println("k th smallest" +getkthsmalest(a,k,isSmall));
		System.out.println("k th Largest" + getkthsmalest(a,k,!isSmall));
	}
	
	public static int getkthsmalest(int[] arr,int k,boolean isSmall)
	{
		int len=arr.length;
		if (isSmall)
			return partion(arr,k-1);
		else
			return partion(arr,len-k);
				
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
