//	Author: Tushar Jayanti
//	github: github/tusharjayanti

import java.util.Scanner;

class Solution{
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		String str = io.next();
		io.close();
		try{
			int n = Integer.parseInt(str);
			System.out.println(n);
		}
		catch(Exception e)
		{
			System.err.println("Bad String");
		}
	}
}
