//	Author: Tushar Jayanti
//	github: github/tusharjayanti

import java.util.Scanner;

class Solution{
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		int size = io.nextInt();
		int[] input = new int[size];
		for(int i=0;i<size;i++)
		{
			input[i] = io.nextInt();
		}
		io.close();
		for(int i=size-1;i>=0;i--)
		{
			System.out.print(input[i]+" ");
		}
		System.out.println();
	}

}