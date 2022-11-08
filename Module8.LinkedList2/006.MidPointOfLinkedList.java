package Module8.LinkedList2;

public class MidPointLinkedList extends InsertRecursive {

	public static void main(String[] args)
	{
		Node head=new Node(3);
		Node second=new Node(4);
		Node third=new Node(5);
		Node forth=new Node(6);
		Node fifth=new Node(7);
		head.next=second;
		second.next=third;
		third.next=forth;
		forth.next=fifth;
		
		
		Node ans=MidPointLL(head);
		System.out.println(ans.data);
	}
	public static Node<Integer> MidPointLL (Node<Integer> head)
	{
		Node slow=head;
		Node fast=head;
		
		while(fast.next!=null && fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
		
	}

}
