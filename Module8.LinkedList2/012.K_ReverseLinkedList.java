package Module8.LinkedList2;

public class K_ReverseLL {

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
 //10 9 8 5 4 3 2 
		Node<Integer>ans=K_ReverseLL(head11,3);
		while(ans!=null)
		{
			System.out.print(ans.data +" ");
			ans=ans.next;
		}	

	}
	public static Node<Integer> AddFirst(Node<Integer> head,Node<Integer> Add)
	{
		Add.next=head;
		return Add;
	}
	
	
	public static Node<Integer> K_ReverseLL(Node<Integer> head,int k)
	{
		if(k==0||k==1)return head;
		Node<Integer> prevLL=null;
		Node<Integer> currLL=null;
		
		while(Size(head)>0)
		{
			int size=Size(head);
			if(size>=k)
			{
				int x=1;
				while(x<=k)
				{
					Node RemovedFirst=head;//remove first && add first in curr
					head=head.next;
					RemovedFirst.next=null;
					currLL=AddFirst(currLL,RemovedFirst);
					x++;
				}
				//current made
				if(prevLL==null)
				{
					prevLL=currLL;
					currLL=null;
					
				}else
				{
					AddLast(prevLL,currLL);
					currLL=null;
				}
			}
			else 
			{ 
				    Node temp=head;
					AddLast(prevLL,temp);
					head=null;	
			}
		}
		return prevLL;	    		
	}
	public static void AddLast(Node<Integer> head,Node Add)
	{
		Node<Integer> temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=Add;
	}
	  
	public static int Size(Node<Integer> head)
	{
		if(head==null)return -1;
		else if(head.next==null)return 1;
		
		int sa=Size(head.next);
		return ((sa!=-1)?sa+1:-1);
	}
	

}
