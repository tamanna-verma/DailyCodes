package Module7.LinkedList1;

public class IncrementEveryElementInLL {

	public static void main(String[] args) 
	{
	 Node<Integer> head=new Node(10);
	 Node<Integer> second=new Node(20);
	 Node<Integer> third=new Node(30);
	 Node<Integer> forth=new Node(40);
	 
	 head.next=second;
	 second.next=third;
	 third.next=forth;
	 IncrementEveryElementInLL(head);
	 Node temp=head;
	 while(temp!=null)
	 {
		 System.out.print(temp.data+" ");
		 temp=temp.next;
	 }
	}
	public static void IncrementEveryElementInLL(Node head)
	{
		 Node<Integer> temp=head;
		 while(temp!=null)
		 {
			temp.data=temp.data+1;
			temp=temp.next;
		 }
	}

}
