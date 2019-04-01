//	Author: Tushar Jayanti
//	github: github/tusharjayanti

import java.util.Scanner;

class Solution
{
	public static void main(String[]  args)
	{
		Scanner io  = new Scanner(System.in);
		int n = io.nextInt();
		io.close();
		int remainder,count=0,max=0;
		while(n>0)
		{
			remainder = n % 2;
			n/=2;
			if(remainder == 1)
			{
				count++;
				if(count>max)
				{
					max = count;
				}	
			}
			else if(remainder == 0)
			{
				count=0;
			}
		}
		System.out.println(max);

	}
}