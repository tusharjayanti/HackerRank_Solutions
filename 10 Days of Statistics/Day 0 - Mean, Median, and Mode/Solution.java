//	Author: Tushar Jayanti
//	github: github/tusharjayanti

/*Optimize FindMode using hashmap*/

import java.util.Scanner;
import java.util.Arrays;

class Solution
{
	private static void PrintArray(int[] arr)         // O(n)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	private static double FindMean(int[] arr)		// O(n)
	{
		double sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		sum/=arr.length;
		return (double)sum;
	}
	private static double FindMedian(int[] arr)
	{	int n =arr.length;
		double mode=0;
		Arrays.sort(arr);							// O(N.logN)
		if(n%2==0)
		{
			mode = (double)(arr[n/2-1] + arr[n/2]) / 2;
		}
		else
		{
			mode = (double)arr[n/2]/2;
		}
		return mode;

	}
	private static int FindMode(int[] arr)			// O(n^2)
	{
		int itr=0,mode = 0;
		int count,max=0;
		for(int i=0;i<arr.length;i++)
		{
			itr = arr[i];
			count =0;
			for(int j=0;j<arr.length;j++)
			{
				if(itr == arr[j])
					{count++;}
				if(count>max)
				{
					max=count;
					mode = itr;
				}

			}
		}
		return mode;
	}
	public static void main(String[] args) {
		// Taking input
		Scanner io = new Scanner(System.in);
		int n = io.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = io.nextInt();
		}

		System.out.println(FindMean(arr));
		System.out.println(FindMedian(arr));
		PrintArray(arr);
		System.out.println(FindMode(arr));


	}
}
