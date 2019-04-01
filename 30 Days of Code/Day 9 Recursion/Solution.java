//	Author: Tushar Jayanti
//	github: github/tusharjayanti


import java.util.Scanner;

public class Solution
{
		public static void main(String[] args)
		{
			Scanner io = new Scanner(System.in);
			int n = io.nextInt();
			System.out.println(factorial(n));
		}



		private static Long factorial(int n){
			long result = 1;
			if(n<0){
				return null;
			}
			while(n>0)
			{
				result *=n--;
			}
			return result;
		} 
}