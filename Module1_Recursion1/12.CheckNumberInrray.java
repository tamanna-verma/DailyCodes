public class Solution {
	
	public static boolean checkNumber(int arr[], int x)
    {
	if(arr.length==1)
    {
        if(arr[0]==x)
        {
            return true;
        }
        else return false;
    }
	  
        int smallArr[]=new int [arr.length-1];
        for(int i=0;i<smallArr.length;i++)
        {
            smallArr[i]=arr[i+1];
        }
       if( checkNumber(smallArr,x)||arr[0]==x)return true;
           else return false;
	}
}
