package Module2;
import java.util.Scanner;
public class RemoveConsecutiveDuplicates {

	public static void main(String[] args) 
	{Scanner scan=new Scanner(System.in);
		 String str=scan.next();
			
			
		  String ans=RemoveConsecutiveDuplicates(str);
	      System.out.println(ans);
	}
  public static String RemoveConsecutiveDuplicates(String str)
  {
	  if(str.length()==1)
	  {
		  return str;
	  }
	  
	  String small=RemoveConsecutiveDuplicates(str.substring(1));
	  if(str.charAt(0)!=small.charAt(0))
	  {
		  return Character.toString(str.charAt(0)).concat(small);
	  }
	  else return small;
  }
}
