import java.util.Scanner;
public class Palindrome
{
	public static boolean isPalindrome(String str)
	{
		String reverse="";
		char ch;
		boolean res;
		for(int i=str.length()-1;i>=0;i--)
		{
			ch=str.charAt(i);
			reverse=reverse+ch;
		}
		if(str.equals(reverse))
			res=true;
		else
			res=false;
		return res;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.next();
		boolean result=isPalindrome(str);
		System.out.println(result);
	}
}
