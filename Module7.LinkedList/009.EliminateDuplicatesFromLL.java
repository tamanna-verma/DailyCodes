public class Solution {

	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head)
	{
		if(head==null)return head;
		int size=0;
		LinkedListNode<Integer> NewHead=head;
        LinkedListNode<Integer> NewTail=head;
		LinkedListNode<Integer> temp=head;
		while(temp!=null)
		{
			while(temp!=null && temp.data==NewTail.data)temp=temp.next;

				NewTail.next=temp;
				NewTail=temp;
		}

		return NewHead;
	}

}
