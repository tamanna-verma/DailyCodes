package Module1;

import java.util.Scanner;

public class PrintDecreasingIncreasing {

	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		int x=scan.nextInt();
		PrintDecreasingIncreasing(x);

	}
	public static void PrintDecreasingIncreasing(int x)
	{
		if(x==0)return;
		
		System.out.print(x +" ");                   //pre area
		PrintDecreasingIncreasing(x-1);
		System.out.print(x +" ");                  //post area
	}


}
