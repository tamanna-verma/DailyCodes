public class Solution {

	public static int sum(int arr[]) 
    {
		if(arr.length==1)return arr[0];
	
       int SmallArr[]=new int[arr.length-1];
        for(int i=0;i<SmallArr.length;i++)
        {
        SmallArr[i]=arr[i+1];    
        }
        return arr[0]+sum(SmallArr);
	}
}
