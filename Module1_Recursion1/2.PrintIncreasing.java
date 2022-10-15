package Module1;

import java.util.Scanner;
public class PrintIncreasing {

	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		int x=scan.nextInt();
		PrintIncreasing(x);

	}
	public static void PrintIncreasing(int x)
	{
		if(x==0)return;
		                                           //pre area
		PrintIncreasing(x-1);
		System.out.print(x +" ");                  //post area
	}

}
