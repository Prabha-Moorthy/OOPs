import java.util.Scanner;
public class TowerOfHanoi
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Disk: ");
		int n=sc.nextInt();
		char src='A',aux='B',dest='C';
		TowerOfHanoi TOH=new TowerOfHanoi(); 
		TOH.solveTOH(n,src,aux,dest);
	}
	void solveTOH(int n,char src,char aux,char dest)
	{
		if(n==1)
		{
			System.out.println("Move disk 1 from rod "+src+" to rod "+dest);
			return;
		}
		//Move 1 rod from first position
		solveTOH(n-1,src,dest,aux);
		//Move 1 rod from second position
		solveTOH(1,src,aux,dest);
		//Move 1 rod from center position
		solveTOH(n-1,aux,src,dest);
	}
}
