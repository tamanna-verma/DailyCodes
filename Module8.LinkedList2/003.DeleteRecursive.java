package Module8.LinkedList2;

public class DeleteRecursive extends InsertRecursive {

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
		DeleteRecursive(head,2);
		DeleteRecursive(head,1);
		System.out.println();
		Node temp2=head;
		while(temp2!=null)
		{
			System.out.print(temp2.data+" ");
			temp2=temp2.next;
		}
	}
	public static Node<Integer> DeleteRecursive(Node<Integer> head,int position)
	{
		  if(head.next==null&&position!=0)
	        {
	            return head;
	        }
		if(position==0)
		{
			return head.next;
		}
		
		if(head.next!=null) 
		{
			
		 head.next= DeleteRecursive(head.next,position-1);	
		}
		else
		{
			return null;
		}
		
		return head;
	}

}
