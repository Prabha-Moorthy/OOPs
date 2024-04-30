import java.util.Scanner;
public class FindMax
{
	public static int findMax(int n,int num[])
	{
		int max=num[0];
		for(int i=0;i<num.length;i++)
		{
			if(max<num[i])
			{
				max=num[i];
			}
		}
		return max;
	}
		
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value: ");
		int n=sc.nextInt();
		int num[]=new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++)
		{
			num[i]=sc.nextInt();
		}
		int result=findMax(n,num);
		System.out.println("Maximum Value is: "+result);
	}
}	
