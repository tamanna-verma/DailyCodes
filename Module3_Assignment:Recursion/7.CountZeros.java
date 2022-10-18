package Module3Assignment;
import java.util.Scanner;
public class CountZeros {

	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	int x=scan.nextInt();
	System.out.println(CountZeros(x));

	}
	public static int CountZeros(int x)
    {
	 if(x>=0&&x<10)
		 {
           if(x==0)return 1;
           else return 0;
		 }
     int small=CountZeros(x/10);
     if(x%10==0)return small+1;
     else return small;
    		 
	}
}
