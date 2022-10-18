package Module3Assignment;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		System.out.println(sumOfDigits(x));
	}
	public static int sumOfDigits(int input)
    {
        if(input>=0&&input<10)return input;
        
        int small=sumOfDigits(input/10);
        int ans=(input%10)+small;
        return ans;
	}

}
