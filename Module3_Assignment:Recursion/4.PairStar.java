package Module3Assignment;
import java.util.Scanner;
public class PairStars {

	public static void main(String[] args) 
	{
	Scanner scan=new Scanner(System.in);
	String str=scan.next();
	System.out.println(PairStars(str));
    }
    public static String PairStars(String str)
    {
    	if(str.length()==1)
    	{
    		return str;
    	}
    	
    	String small=PairStars(str.substring(1));
    	if(str.charAt(0)==small.charAt(0))
    		return str.charAt(0)+("*")+small;
    	else return str.charAt(0)+small;
    }
    
}
