package Module5.OOPS1;

public class DynamicArray

{   
	private int data[];
	private int nextElementIndex;
	
	public DynamicArray()
	{
	data=new int[5];//this will create a new array internally 
	nextElementIndex=0;
	
	}
	public int size()
	{
		return nextElementIndex;
	}
	public boolean isEmpty()
	{
		return nextElementIndex==0;
	}
	public int get(int i)
	{
		if(i>=nextElementIndex)return -1;
		return data[i];
	}
	public void set(int index,int value)
	{
		if(index>=nextElementIndex)return;
		data[index]=value;
	}
	public void add(int element)
	{
		if(nextElementIndex==data.length)
		{
			doubleCapacity();
		}
		data[nextElementIndex]=element;
		nextElementIndex++;
	}	
	private void doubleCapacity()
	{
		int temp[]=data;
		data=new int[this.data.length*2];
		for(int i=0;i<temp.length;i++)
		{
			data[i]=temp[i];
		}
		
	}
	public int removeLast()
	{   if(nextElementIndex==0)return -1;
		int temp=data[nextElementIndex-1];
		data[nextElementIndex-1]=0;
		nextElementIndex--;
		return temp;
		
	}
}

