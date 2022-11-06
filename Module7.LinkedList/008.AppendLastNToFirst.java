public class Solution {

	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) 
	{
		if(head==null||n==0)return head;
		
		int size=0;
		LinkedListNode<Integer> temporary=head;
		while(temporary!=null)
		{
			size+=1;
			temporary=temporary.next;
		}
		int index=size-n;

		int travel=0;
		LinkedListNode<Integer> temp=head;
		while(travel<index-1)
		{
			travel+=1;
			temp=temp.next;
		}
     LinkedListNode<Integer> NewHead=temp.next;
	   LinkedListNode<Integer> pointer=NewHead;
	 temp.next=null;
	 while(pointer.next!=null)
		{
			pointer=pointer.next;
		}
    pointer.next=head;
		//1 2 3 4 5 6 7 
		//5 6 7      1 2 3 4
	 return NewHead;	
	}

}
