import java.util.Scanner;
public class Rectangle
{
	public int Area(int len,int bre)
	{
		return len*bre;
	}
	public int Perimeter(int len,int bre)
	{
		return 2*(len+bre);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length: ");
		int len=sc.nextInt();
		System.out.println("Enter the breath: ");
		int bre=sc.nextInt();
		Rectangle R=new Rectangle();
		int area =R.Area(len,bre);
		int peri =R.Perimeter(len,bre);
		System.out.println(area);
		System.out.println(peri);
	}
}
