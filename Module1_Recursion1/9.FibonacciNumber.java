package Module1;

import java.util.Scanner;

public class FibonacciNumber 
{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	System.out.println(Fibbonacci(n));
}
public static int Fibbonacci(int n)
{
	if(n==0||n==1)return n;
	
	return(Fibbonacci(n-1)+Fibbonacci(n-2));	
}


}
