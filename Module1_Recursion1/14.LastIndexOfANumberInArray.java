
public class Solution {

	public static int lastIndex(int input[], int x) {
		if(input.length==0)return -1;
        if(input[input.length-1]==x)return input.length-1;
        
        int smallArr[]=new int[input.length-1];
        for(int i=0;i<smallArr.length;i++)
        {
            smallArr[i]=input[i];
        }
        int smallAns=lastIndex(smallArr,x);
        if(smallAns==-1)return smallAns;
        else return smallAns;
	} 
	
}
