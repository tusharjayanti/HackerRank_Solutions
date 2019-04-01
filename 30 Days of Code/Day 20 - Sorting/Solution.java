//	Author: Tushar Jayanti
//	github: github/tusharjayanti
/*version of bubble sort can do better than O(n^2)*/

import java.util.Scanner;

class Solution{
	private static int numOfSwaps = 0;


	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		int n = io.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=io.nextInt();
		}
		io.close();

		BubbleSort(array);
		System.out.println("Array is sorted in " + numOfSwaps + " swaps.");
		System.out.println("First Element: " + array[0]);
		System.out.println("Last Element: " + array[n-1]);
	}


	private static void BubbleSort(int[] arr)
		{
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr.length-1;j++)
					{
						if(arr[j]>arr[j+1])
					{
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
						numOfSwaps++;
					}
				}
				
				if(numOfSwaps==0){break;}
			}
		}

}