package Module8.LinkedList2;

public class BubbleSortLL {

	public static void main(String[] args) {
		Node <Integer> head11=new Node<Integer>(5);
		Node <Integer> head21=new Node<Integer>(22);
		Node <Integer> head31=new Node<Integer>(31);
		Node <Integer> head41=new Node<Integer>(41);
		Node <Integer> head51=new Node<Integer>(44);
		Node <Integer> head61=new Node<Integer>(61);
		Node <Integer> head71=new Node<Integer>(71);
		head11.next=head21;
		head21.next=head31;
		head31.next=head41;
		head41.next=head51;
		head51.next=head61;
		head61.next=head71;
		Node <Integer> head1=new Node<Integer>(1);
		Node <Integer> head2=new Node<Integer>(2);
		Node <Integer> head3=new Node<Integer>(3);
		Node <Integer> head4=new Node<Integer>(4);
		Node <Integer> head5=new Node<Integer>(8);
		Node <Integer> head6=new Node<Integer>(11);
		Node <Integer> head7=new Node<Integer>(17);
		head71.next=head1;
		head1.next=head2;
		head2.next=head3;
		head3.next=head4;
		head4.next=head5;
		head5.next=head6;
		head6.next=head7;
 //10 9 8 5 4 3 2 1
		Node<Integer>ans=BubbleSortLL(head11);
		while(ans!=null)
		{
			System.out.print(ans.data +" ");
			ans=ans.next;
		}	
	}
	public static Node<Integer> BubbleSortLL(Node<Integer> head)
	{
	 int size=Size(head);
	 Node head1=head;
	 for(int i=0;i<size;i++)
	 {
		 Node<Integer> prev=head1;
		 Node<Integer> curr=head1.next;
		
		 for(int j=0;j<size-i-1;j++)
		 {
			 if(prev.data>curr.data)
			 {
			 Integer temp= prev.data;
			 prev.data=curr.data;
			 curr.data=temp;
			 }
			 prev=curr;
			 curr=curr.next;
			 
		 }
		

	 }
		return head;
	}
	public static int Size(Node<Integer> head)
	{
		if(head==null)return -1;
		else if(head.next==null)return 1;
		
		int sa=Size(head.next);
		return ((sa!=-1)?sa+1:-1);
	}

}
