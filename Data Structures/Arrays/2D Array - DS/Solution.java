//	Author: Tushar Jayanti
//	github: github/

import java.util.Scanner;

class Solution {
	
	public static void main(String[] args) {
		int[][] input = new int[6][6];
		Scanner io = new Scanner(System.in);
		
		for(int i=0;i<6;i++)
		{
			for(int j = 0;j<6;j++)
			{
				input[i][j] = io.nextInt();
			}
		}

		io.close();

	// Hourglass sum
		int h_sum = 0;
		int mx_sum = Integer.MIN_VALUE;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				h_sum = input[i][j] + input[i][j+1] + input[i][j+2] + input[i+1][j+1] + input[i+2][j] + input[i+2][j+1] + input[i+2][j+2];
				mx_sum = Math.max(mx_sum,h_sum);
			}
			 
		}

		System.out.println(mx_sum);
		


	}
}