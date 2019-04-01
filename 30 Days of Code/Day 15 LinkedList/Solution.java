//	Author: Tushar Jayanti
//	github: github/tusharjayanti
//	HackerRank: hackerrank/tusharjayanti

import java.util.Scanner;

class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}

class Solution{
	public static Node insert(Node head,int d){
		if(head == null)
		{
			return (new Node(d));
		}
		else
		{
			Node n = head;
			while(n.next!=null)
			{
				n= n.next;
			}
			n.next = new Node(d);
			return head;
		}
	}
	public static void display(Node head)
	{
		Node start = head;
		while(start!=null)
		{
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String[] args)
	{	Scanner io = new Scanner(System.in);
		Node head =null;
		int N = io.nextInt();
		while(N-- > 0)
		{
			int data = io.nextInt();
			head = insert(head,data);
		}
		io.close();
		display(head);
	}
}