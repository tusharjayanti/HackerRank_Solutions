//	Author: Tushar Jayanti
//	github: github/tusharjayanti

import java.util.Scanner;

class Solution{
	public static void main(String[] args) {
		//Take input
		Scanner io = new Scanner(System.in);
		int size = io.nextInt();
		int[] elements = new int[size];
		int[] weights = new int[size];
		for(int i=0;i<size;i++)
		{
			elements[i]=io.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			weights[i]=io.nextInt();
		}
		io.close();
		
		int total=0;
		int totalweights = 0;
		for(int i=0;i<size;i++)
		{
			total+= (elements[i]*weights[i]);
			totalweights+=weights[i];
		}
		double weightedMean = (double) total/totalweights;
		System.out.format("%.1f",weightedMean);
	}
}
