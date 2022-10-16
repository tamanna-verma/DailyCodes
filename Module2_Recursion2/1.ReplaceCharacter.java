package Module2;
import java.util.Scanner;
public class ReplaceCharacter {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String str= scan.next();
		
		Character From=scan.next().charAt(0);
		Character To=scan.next().charAt(0);
		
		String ans=ReplaceCharacter(str,From,To);
        System.out.println(ans);
	}

	public static String ReplaceCharacter(String str, Character From , Character To)
	{
		if(str.length()==1)
		{
			if(Character.compare(From,str.charAt(0))==0)return To.toString();
			else return str;
		}
		
		String smallAns=ReplaceCharacter(str.substring(1),From,To);
		Character add=str.charAt(0);
		if(Character.compare(From,add)==0)add=To;
		return add.toString().concat(smallAns);
	}
}
