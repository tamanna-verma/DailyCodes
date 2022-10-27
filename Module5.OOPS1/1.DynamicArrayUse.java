package Module5.OOPS1;

public class DynamicArrayUse {

	public static void main(String[] args)
	{
		DynamicArray d=new DynamicArray();
		for(int i=0;i<=100;i++)
		{
			d.add(i+100);//d.add() funcction inserts new element at the end
		}
		 
		d.set(3,100);
	    System.out.println(d.size());
	    System.out.println(d.get(2));
	    System.out.println(d.get(4));
	    
		while(!d.isEmpty())
		{
			System.out.println(d.removeLast());
			System.out.println("size -->"+d.size());
		}
	}

}
