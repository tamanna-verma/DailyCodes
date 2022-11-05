public class Solution {

	public static int length(LinkedListNode<Integer> head)
	{
		int length =0;
		LinkedListNode <Integer> temp=head;
		while(temp!=null)
		{
			length++;
			temp=temp.next;
		}
		return length;
	}
}
