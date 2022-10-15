package Module1;
import java.util.Scanner;
public class SmOfFirstNNaturalNumbers 
{
public static void main(String[]args)
{
	Scanner scan=new Scanner(System.in);
	int x=scan.nextInt();
   int ans= Sum(x);
   System.out.println(ans);
}
	
public static int Sum(int x)
{
	if(x==0)
		{
		return 0;
		}
	int smallerSum=Sum(x-1);
	return smallerSum+x;
}
}
