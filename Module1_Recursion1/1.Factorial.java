package Module1;

import java.util.Scanner;
import java.util.*;
public class Factorial
{
	
public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	int input=scan.nextInt();
	int ans=Factorial(input);
	System.out.println(ans);
	
}
public static int Factorial(int x)
{
	if(x==0)return 1;
	int fnm1=Factorial(x-1);
	int fn=fnm1*x;
	return fn;
}

}
