import java.util.Scanner;

public class Solution
{
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		int n = io.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = io.nextInt();
		}
		int max = getMax(arr);
		int min = getMin(arr);
		System.out.println(Math.abs(max - min));
	}
	private static int getMin(int[] arr)
	{
		int min = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		return min;
	}
	private static int getMax(int[] arr)
	{
		int max = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		return max;
	}
}