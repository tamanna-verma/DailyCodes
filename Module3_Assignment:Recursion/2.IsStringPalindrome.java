package Module3Assignment;

import java.util.Scanner;

public class IsPalindrome {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		System.out.println(isStringPalindrome(str));

	}
	public static boolean isStringPalindrome(String input) {
		if(input.length()==0||input.length()==1)return true;
        
        if(input.charAt(0)!=input.charAt(input.length()-1))return false;
        else return isStringPalindrome(input.substring(1,input.length()-1));
	}
}
