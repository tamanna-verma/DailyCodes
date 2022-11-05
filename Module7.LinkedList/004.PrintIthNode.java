public class Solution {

	public static void printIthNode(LinkedListNode<Integer> head, int i)
	{
		if(head==null)
		{
			return;
		}
		LinkedListNode<Integer> temp=head;
		int count=0;		
		while(count<=i&&temp !=null)
		{
			if(count==i)
			{
			System.out.println(temp.data);
			break;
			}
			count++;
			temp=temp.next;
		}
	
	}
}
