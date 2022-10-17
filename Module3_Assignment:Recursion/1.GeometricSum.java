public class solution 
{
  public static double findGeometricSum(int k)
    {
	  if(k==0)
      {
          return 1;
      }
        double ans =1/Math.pow(2,k);
        return ans+findGeometricSum(k-1);        
  }    
}
