package Module8.LinkedList2;

public class ReverseLLRecursively extends InsertRecursive{

	public static void main(String[] args) 
	{
		Node head=InsertRecursive(null,0,3);
		Node second=InsertRecursive(head,1,4);
		Node third=InsertRecursive(head,2,5);
		Node forth=InsertRecursive(head,2,6);
		Node fifth=InsertRecursive(head,2,7);
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
		head=ReverseLL(head);
		temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static Node<Integer> ReverseLL(Node<Integer> head)
	{
		if(head==null || head.next==null)
		{
		return head;	
		}
		Node<Integer>sa=ReverseLL(head.next);
		Node<Integer> temp=sa;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=head;
		head.next=null;
		return sa;
	}

}
