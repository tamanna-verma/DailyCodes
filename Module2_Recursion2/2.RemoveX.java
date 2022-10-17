package Module2;

import java.util.Scanner;

public class RemoveX {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str= scan.next();
		
		Character x=scan.next().charAt(0);
		
		String ans=RemoveX(str,x);
        System.out.println(ans);

	}
    public static String RemoveX(String str, Character X)
    {
    	if(str.length()==0)
    	{
    		return "";
    	}
    	
    	String curr="";
    	if(str.charAt(0)!=X)curr+=str.charAt(0);
    	String small=RemoveX(str.substring(1),X);
    	return curr.concat(small);
    }
}
