import java.util.Scanner;
public class Library
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Book b=new Book();
		System.out.println("Enter the Title of Book: ");
		b.setTitle(sc.next());
		System.out.println("Enter the Author of Book: ");
		b.setAuthor(sc.next());
		System.out.println("Enter the Publisher of Book: ");
		b.setPublisher(sc.next());
		System.out.println(b.getTitle());
		System.out.println(b.getAuthor());
		System.out.println(b.getPublisher());
	}
}

class Book
{
	private String title;
	private String author;
	private String publisher;
	
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title=title;
	}
	public String getAuthor()
	{
		return author;
	}
	public void setAuthor(String author)
	{
		this.author=author;
	}
	public String getPublisher()
	{
		return publisher;
	}
	public void setPublisher(String publisher)
	{
		this.publisher=publisher;
	}
}
