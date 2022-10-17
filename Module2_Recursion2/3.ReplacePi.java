package Module2;

import java.util.Scanner;

public class ReplacePi 
{
  public static void main(String[] args)
  {
	  Scanner scan=new Scanner(System.in);
	  String str=scan.next();
	
		
	  String ans=ReplacePi(str);
      System.out.println(ans);

  }
  public static String ReplacePi(String str)
  {
	  if(str.length()==0||str.length()==1)return str; 
	 
	  String ans="";
	  if(str.charAt(0)=='p'&&str.charAt(1)=='i')
		{
		  ans+=3.14+ReplacePi(str.substring(2));
		  
		}
	  else
	  {
		  ans+=str.charAt(0)+ReplacePi(str.substring(1));  
	  }
	  return ans;
  }
}
