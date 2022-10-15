package Module1;

import java.util.Scanner;
public class NumberOfDigits 
{
	public static void main(String[] args)
	{
	 Scanner scan=new Scanner(System.in);	
	 int num=scan.nextInt();
	 int ans=Digits(num);
	 System.out.println(ans);
	}
	public static int Digits(int num)
	{
		if(num>=0&&num<=9)
		{
			return 1;
		}
		int smaller=Digits(num/10);
		return smaller+1;
		
	}
}
