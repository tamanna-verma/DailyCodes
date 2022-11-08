package Module8.LinkedList2;

public class InsertRecursive {

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
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
    
	public static Node<Integer> InsertRecursive(Node<Integer> head,int position,int val)
	{
		if(position==0&&head==null)
		{
			Node<Integer> sa=new Node(val);
			return sa;
		}
		
	  if(position==0)
	  {
			Node<Integer> sa=new Node(val);
			sa.next=head;
			return sa;
	  }
	  else
	  {
		 head.next=InsertRecursive(head.next,position-1,val);
		 return head;
	  }		  
	  }
}

