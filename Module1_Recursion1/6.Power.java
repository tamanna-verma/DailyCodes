package Module1;
import java.util.Scanner;
public class Power
{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	int pow=scan.nextInt();
	int ans=Power(num, pow);
	System.out.println(ans);
}

public static int Power(int num, int pow)
{
	if(pow==1)
	{
	 return num;	
	}
	int smallerAns=Power(num,pow-1);
	int ans=smallerAns*num;
	return ans;
}

}
