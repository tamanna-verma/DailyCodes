package Module7.LinkedList1;

public class PrintRecursive {

	public static void main(String[] args) {
		 Node<Integer> head=new Node(10);
		 Node<Integer> second=new Node(20);
		 Node<Integer> third=new Node(30);
		 Node<Integer> forth=new Node(40);
		 
		 head.next=second;
		 second.next=third;
		 third.next=forth;
		 PrintRecursive(head);
	}

	public static void PrintRecursive(Node<Integer> head)
	{
		if(head==null)
		{
			return;
			
		}
		System.out.print(head.data+" ");
		PrintRecursive(head.next);
	}
}
