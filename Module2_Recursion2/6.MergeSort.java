package Module2;
import java.util.Scanner;
public class MergeSort 
{

	public static void main(String[] args) 
	{
	  Scanner scan=new Scanner(System.in);
	  int n=scan.nextInt();
	  int arr[]=new int[n];
	  for(int i=0;i<n;i++)
	  {
		arr[i]=scan.nextInt();  
	  }
	  int ans[]= MergeSort(arr);
	     for(int i=0;i<n;i++)
		  {
	    	 System.out.println(ans[i]);
		  }
	  
	}
	public static int[] MergeSort(int arr[])
	{
		if(arr.length<=1)return arr;	
		
		int first[]=new int[arr.length/2];   //first half array created
		for(int i=0;i<first.length;i++)
		{
			first[i]=arr[i];
		}
		int second[]=new int[arr.length-first.length];       //second half array created
		for(int i=0;i<second.length;i++)
		{
			second[i]=arr[i+first.length];
		}
		
		MergeSort(first);
		MergeSort(second);
		
		return Merge(first,second,arr);
	
	}
	
	public static int[] Merge(int a[],int b[],int ans[])
	{
  
	  int i=0;
	  int j=0;
	  int index=0;
	  while(i<a.length && j<b.length&&index<ans.length)
	  {
		  if(a[i]<=b[j])
		  {
			  ans[index]=a[i];
			  i++;
			
		  }
		  else if(b[j]<a[i])
		  {
			  ans[index]=b[j];
			  j++;
			  
		  }
		  index++;
	  }
	  
	  if(i==a.length)
	  {
		  while(j<b.length)
		  {
			  ans[index]=b[j];
			  j++;
			  index++;
		  }
		  
	  }
	  else if(j==b.length)
	  {
		  while(i<a.length)
		  {
		  ans[index]=a[i];
		  i++;
		  index++;
		  }
	  }
	 
	 return ans;
	}

}
