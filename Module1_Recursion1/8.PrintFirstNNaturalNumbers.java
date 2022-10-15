package Module1;
import java.util.Scanner;
public class PrintFirstNNaturalNumbers {

	public static void main(String[] args) 
	{
	  	Scanner scan=new Scanner(System.in);
	  	int n=scan.nextInt();
	  	Print(n);
	}
   public static void Print(int n)
   {
	   if(n==0)return;
	   Print(n-1);
	   System.out.print(n +" ");
   }
}
