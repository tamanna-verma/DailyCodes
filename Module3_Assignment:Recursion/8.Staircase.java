package Module3Assignment;
import java.util.Scanner;
public class StairCase {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		System.out.println(Stairs(x));
	}
	public static int Stairs(int n)
    {
		if(n<0)return 0;
		else if(n==0)return 1;
		
		
		int steps=Stairs(n-1)+Stairs(n-2)+Stairs(n-3);
	    return steps;
		
    }
}
