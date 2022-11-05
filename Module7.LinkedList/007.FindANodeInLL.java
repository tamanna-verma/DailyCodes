public class Solution {
	public static int findNode(LinkedListNode<Integer> head, int n) {
		// Write your code here.
	LinkedListNode<Integer> temporary=head;
	int index=0;
	while(temporary!=null)
	{
		if(temporary.data==n)return index;
		temporary=temporary.next;
		index++;
		
	}
	return -1;
	}
}
