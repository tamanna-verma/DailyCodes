package Module8.LinkedList2;

class DoubleNode{
	Node head;
	Node tail;
	
	public DoubleNode(Node first,Node second)
	{
		this.head=first;
		this.tail=second;
	}
}
public class ReverseLLONTimeComplexity extends InsertRecursive {

	public static void main(String[] args) {
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
		
		DoubleNode ans=ReverseLLONUsingHeadAndTail(head);
		temp=ans.head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
		
		Node newhead=ReverseLLONTimeComplexity(ans.head);//this is without using any double node class
		temp=newhead;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
	}
	
	
	public static Node<Integer> ReverseLLONTimeComplexity(Node<Integer> head)
	{
	 if(head==null || head.next==null)
	 {
		 return head;
	 }
	 //smaller answer will give new head
	 Node<Integer> sa=ReverseLLONTimeComplexity(head.next);
	 
//sa=4       1-->2<--3<--4 //we can simply save 1's next i.e 2
//but i now need to go to tail and tail is head.next only 
//so let me just save it and make tails next as oldhead
	 
     Node tail=head.next;
     tail.next=head;
     head.next=null;
     return sa;
	 
	}
	
	public static DoubleNode ReverseLLONUsingHeadAndTail(Node<Integer> head)
	{
		if(head==null || head.next==null)
		 {
			 DoubleNode sa=new DoubleNode(head,head);
			 return sa;
		 }
		//so we have met the base case 
		//4 5 6 7 
		//7 6 5 4 
		
		DoubleNode sa=ReverseLLONUsingHeadAndTail(head.next);
		sa.tail.next=head;
		sa.tail=sa.tail.next;
		head.next=null;
		return sa;
		
	}

}
