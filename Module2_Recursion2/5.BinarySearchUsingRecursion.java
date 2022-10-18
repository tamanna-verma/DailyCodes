package Module2;
import java.util.Scanner;
public class BinarySearchUsingRecursion {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		int num=scan.nextInt();
		int si=0;
		int ei=arr.length-1;
		int ans=BinarySearch(arr,num,si,ei);
		System.out.println(ans);
		
	}
    
	public static int BinarySearch(int[] arr,int num,int si, int ei)
	{
		if(si>ei)
		{
			return -1;
		}
		
		int mid=si+(ei-si)/2;
		if(arr[mid]==num)return mid;
		else if(arr[mid]<num)return BinarySearch(arr,num,mid+1,ei);
		else return BinarySearch(arr,num,si,mid-1);
	
	}
}
