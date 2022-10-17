package Module3Assignment;
import java.util.Scanner;
public class ConvertStringToInteger {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		int ans=convertStringToInt(str);
		System.out.println(ans);
	}
	public static int convertStringToInt(String input)
    {
		if(input.length()==1)
		{
			return input.charAt(0)-'0';
		}
		
		int current=input.charAt(input.length()-1)-'0';
		return  convertStringToInt(input.substring(0,input.length()-1))*10+current;
	}
}
