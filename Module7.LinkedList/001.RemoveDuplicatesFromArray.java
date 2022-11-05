package Module7.LinkedList1;
import java.util.ArrayList;
public class RemoveDuplicatesFromArray {

		public static ArrayList<Integer> RemoveDuplicates(int [] arr)
		{
			ArrayList<Integer> al=new ArrayList<>();
			
			al.add(arr[0]);
			for(int i=1;i<arr.length;i++)
			{
				if(arr[i]!=arr[i-1])al.add(arr[i]);
			}
			
		
			return al;
		}
       public static void main(String [] args)
       {
    	   int arr[]= {10,20,30,30,30,4050,50,60,60,90};
    	   System.out.println(arr);
    	   ArrayList<Integer> ans=RemoveDuplicates(arr);
    	   System.out.println(ans);
       }
	}


