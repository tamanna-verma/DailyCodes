package Module1;

import java.util.Scanner;
public class PrintDecreasing {

	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		int x=scan.nextInt();
		PrintDecreasing(x);

	}
	public static void PrintDecreasing(int x)
	{
		if(x==0)return;
		                                                  
		System.out.print(x +" ");              //pre area          
		PrintDecreasing(x-1);
		                                        //post area
	}

}
