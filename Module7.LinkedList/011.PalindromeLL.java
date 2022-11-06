
public class Solution {
    public static LinkedListNode Reverse(LinkedListNode head)
	{
		if(head.next==null)
		{
			return head;
		}
		LinkedListNode reversed=Reverse(head.next);
		LinkedListNode temp=reversed;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=head;
		head.next=null;
		return reversed;
	}
 
	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		if(head==null||head.next==null)return true;
		LinkedListNode<Integer> slow=head;
		LinkedListNode<Integer> fast=head;

		while(fast.next!=null && fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}

		LinkedListNode<Integer> SecondHead=Reverse(slow.next);
		LinkedListNode<Integer> temp=head;
		while(SecondHead!=null)
		{
           if(temp.data!=SecondHead.data)return false;
			temp=temp.next;
			SecondHead=SecondHead.next;
		}
		return true;
	}

}
