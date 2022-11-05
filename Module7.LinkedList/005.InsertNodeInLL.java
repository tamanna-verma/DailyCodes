public class Solution {

	public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int pos, int data)
	{
	if(pos==0) //agar position hi zero hai to
	{
		 LinkedListNode nyi=new LinkedListNode(data);
		 nyi.next=head;
		 return nyi;
	}
	int size=1;
	LinkedListNode temporary=head;
	while(temporary!=null)
	{
		temporary=temporary.next;
		size++;
	}
    if(size<pos)return head; //agar position is greater than LL size +1

	LinkedListNode<Integer> temp=head; //else agar shi position hai to
	 int index=0;
	 while(index<pos-1&&temp!=null)
	 {
       temp=temp.next;
	   index=index+1;
	 }
	 LinkedListNode prev=temp;
	 LinkedListNode next=prev.next;
	 LinkedListNode nyi=new LinkedListNode(data);
	 prev.next=nyi;
	 nyi.next=next;
	return head;
	}

}
