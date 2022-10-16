
public class Solution 
{

	public static int firstIndex(int input[], int x)
    {
		
		if(input.length==0)return -1;
        if(input[0]==x)return 0;
        
        int smallArr[]=new int[input.length-1];
        for(int i=0;i<smallArr.length;i++)
        {
            smallArr[i]=input[i+1];
        }
        int smallAns=firstIndex(smallArr,x);
        if(smallAns==-1)return smallAns;
        else return smallAns+1;
	}
    
	
}
