//	Author: Tushar Jayanti
//	github: github/tusharjayanti


import java.util.Scanner;
import java.util.HashMap;


public class Solution{
	public static void main(String[] args)
	{
		Scanner io = new Scanner(System.in);
		int t = io.nextInt();
		HashMap<String,Integer> map = new HashMap<>();
		for(int i=0;i<t;i++)
		{
			String name = io.next();
			int phone = io.nextInt();
			map.put(name,phone);
		}

		for(int i=0;i<t;i++)
		{
			String str = io.next();
			if(map.containsKey(str))
			{
				System.out.println(str+"="+map.get(str));
			}
			else{
			System.out.println("Not found");	
			}
		}
		io.close();
	}
}