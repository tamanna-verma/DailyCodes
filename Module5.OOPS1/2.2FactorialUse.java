package Module5.OOPS1;

public class FractionUse {

	public static void main(String args[]) 
	{
		Fraction f1=new Fraction(4,6);
	    f1.print();
		System.out.println(f1.getNumerator()+"/"+f1.getDenominator());
		f1.increment();
		Fraction f2=new Fraction(8,12);
		f1.add(f2);
		Fraction f3=Fraction.add(f1,f2);
		f3.print();
	}
	 
 
}
