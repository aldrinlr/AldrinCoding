package sorting;

import java.util.*;

class QuickSort
{
	static int c;
	
	public static void main(String arg[])
	{
		QuickSort q=new QuickSort();
		int i;

		int arr[] = {20, 3, -1, 16, 33, 8};;
		int n = arr.length;
		System.out.println("\nThe Unsorted Elements in Array:");
		for(i=0;i<n;i++)		
			System.out.print(arr[i]+" ");
		System.out.println();
		System.out.println();
		q.quick(arr,0,n-1,n);

		System.out.println("\nThe Sorted Elements in Array:");
		for(i=0;i<n;i++)		
			System.out.print(arr[i]+" ");
	}

	void quick(int arr[],int low,int high,int n)
	{
		if(low<high)
		{
			int k=partition(arr,low,high,n);

			quick(arr,low,k-1,n);
			quick(arr,k+1,high,n);
		}
	}

	int partition(int arr[],int low,int high,int n)
	{
		int pivot=arr[low];
		int lb=low;
		int ub=high;
		int temp;

		while(lb<ub)
		{
			while(arr[lb]<=pivot&&lb<high)
				lb++;
			while(arr[ub]>pivot)
				ub--;
			if(lb<ub)
			{
				temp=arr[lb];
				arr[lb]=arr[ub];
				arr[ub]=temp;
			}
		}
		
		arr[low]=arr[ub];
		arr[ub]=pivot;

		c++;
		System.out.println("Pass "+c);
		for(int i=0;i<n;i++)		
		System.out.print(arr[i]+" ");
		System.out.println();

		return ub;
	}

}
