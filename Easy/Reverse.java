import java.util.Scanner;
public class Reverse
{
	public static String reverseString(String str)
	{
		String reverse="";
		char ch;
		for(int i=str.length()-1;i>=0;i--)
		{
			ch=str.charAt(i);
			reverse=reverse+ch;
		}
		return reverse;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.next();
		System.out.println("Reverse String: "+reverseString(str));
	}
}
