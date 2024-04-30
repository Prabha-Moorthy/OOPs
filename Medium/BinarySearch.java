import java.util.*;
public class BinarySearch
{
	int array[];
	int target;
	BinarySearch(int array[],int target)
	{
		this.array=array;
		this.target=target;
	}
	public int binarySearch(int []array,int target)
	{
		int low=0;
		int high=array.length-1;
		Arrays.sort(array);
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			if(array[mid]==target)
			{
				return mid;
			}
			else if(array[mid]<target)
			{
				low=mid+1;
			}else
			{
				high=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements in an array");
		int n=sc.nextInt();
        	int[] array = new int[n];
        	System.out.println("Enter the elements in an array");
		for(int i=0;i<n;i++) 
		{
			array[i]=sc.nextInt();
		}
		System.out.println("Enter the elements to be searched");
		int target = sc.nextInt();
		BinarySearch binarysearch=new BinarySearch(array,target);
		int index =binarysearch.binarySearch(array, target);
		if (index != -1) 
		{
		    System.out.println("Element " + target + " found at index " + index);
		} else {
		    System.out.println("Element " + target + " not found in the array");
		}
	}
}
