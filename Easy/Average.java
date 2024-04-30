import java.util.Scanner;
public class Average
{
	public static int calculateAverage(int n,int num[])
	{
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			sum=sum+num[i];
		}
		int ave=sum/n;
		return ave;
	}
	
	public static void main(String agrs[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value: ");
		int n=sc.nextInt();
		System.out.println("Enter the Elements: ");
		int num[]=new int[n];
		for(int i=0;i<n;i++)
		{
			num[i]=sc.nextInt();
		}
		int result=calculateAverage(n,num);
		System.out.println("Average value: "+result);
	}
}
