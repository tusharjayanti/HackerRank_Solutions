import java.util.Scanner;

abstract class Book{
	String title;
	String author;
	Book(String title, String author)
	{
		this.title = title;
		this.author = author;
	}
	abstract void display();
}

class Mybook extends Book{
	int price;
	Mybook(String title, String author, int price)
	{
		super(title,author);
		this.price = price;
	}

	void display(){
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
	}
}



class Solution
{
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		String title = io.nextLine();
		String author = io.nextLine();
		int price = io.nextInt();
		Book novel = new Mybook(title,author,price);
		novel.display();
		
	}

}