//	Author: Tushar Jayanti
//	github: github/tusharjayanti

import java.util.Scanner;

class Solution{
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		int[][] input = new int[6][6];
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				input[i][j] = io.nextInt();
			}
		}

		System.out.println("\n"+maxHourSum(input));
	}
	io.close();
	private static int maxHourSum(int[][] arr)
	{
		int max = Integer.MIN_VALUE;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				int sum = (arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]);
				if(max<sum) { max=sum;}
			}

		}

		return max;
	}

}
