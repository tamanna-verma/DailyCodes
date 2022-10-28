package Module5.OOPS1;

public class Fraction 
{
   private int numerator;
   private int denominator;
   
   public Fraction(int numerator,int denominator)
   {
	   if(denominator==0)denominator=1;
	   this.numerator=numerator;
	   this.denominator=denominator;
	   simplify();
   }
   public void print()
   {
	   System.out.println(this.numerator+"/"+this.denominator);
   }
   public void setNumerator(int numerator)
   {
	   this.numerator=numerator;
	   simplify();
	   
   }
   public void setDenominator(int denominator)
   {
	   if(denominator==0)return;
	   this.denominator=denominator;
	   simplify();
	   
   }
   public int getNumerator()
   {
	   return numerator;
   }
   
   public int getDenominator()
   {
	   return denominator;
   }
   
   public void simplify()
   {
	   int gcd=1;
	   int temp=2;
	   while(temp<=Math.min(numerator, denominator))
	   {
		   if(numerator%temp==0&&denominator%temp==0)gcd=temp;
	   }
	   numerator=numerator/gcd;
	   denominator=denominator/gcd;
   }
   public void increment()
   {
	   numerator=numerator+denominator;
	   simplify();
   }
   
   public void add(Fraction f2)
   {
	   int y=this.denominator;
	   int x=numerator;
	   denominator=y*f2.denominator;
	   numerator=x*(denominator/y)+f2.numerator*(denominator/f2.denominator);
	  
   }
   
   public static Fraction add(Fraction f1,Fraction f2)
   {
	   int num=f1.numerator*f2.denominator+(f2.numerator*f1.denominator);	
	   int den=f1.denominator*f2.denominator;
	    Fraction f3=new Fraction(num,den);
	   return f3;
	   
   }
  
}
