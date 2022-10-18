package Module3Assignment;
import java.util.Scanner;
public class Multiplication {

	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	int m=scan.nextInt();
	int n=scan.nextInt();
	System.out.println(multiplyTwoIntegers(m,n));

	}
	public static int multiplyTwoIntegers(int m, int n)
    {
	 if(n==1)return m;
     int small=multiplyTwoIntegers(m,n-1);
     return small+m;
	}
}
