package Module1;
import java.util.Scanner;
public class CheckIfArrayIsSorted
{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	int x=scan.nextInt();
	int arr[]=new int[x];
	for(int i=0;i<x;i++)
	{
		arr[i]=scan.nextInt();
	}
	System.out.println(sorted(arr,0));
	
}

public static boolean sorted(int arr[],int index)
{
	if(index==arr.length-2)
	{
		if(arr[index] <arr[index+1])return true;
		else return false;
	}
	
	if(arr[index]<arr[index+1]&&sorted(arr,index+1))return true;
	else return false;
 }

}
