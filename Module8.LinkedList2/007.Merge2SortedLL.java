package Module8.LinkedList2;

public class Merge2SortedLL {

	public static void main(String[] args)
	{
		Node <Integer> head1=new Node<Integer>(1);
		Node <Integer> head2=new Node<Integer>(2);
		Node <Integer> head3=new Node<Integer>(3);
		Node <Integer> head4=new Node<Integer>(4);
		Node <Integer> head5=new Node<Integer>(8);
		Node <Integer> head6=new Node<Integer>(11);
		Node <Integer> head7=new Node<Integer>(17);
		head1.next=head2;
		head2.next=head3;
		head3.next=head4;
		head4.next=head5;
		head5.next=head6;
		head6.next=head7;
Node first=head1;
		
		while(head1!=null)
		{
			System.out.print(head1.data+" ");
			head1=head1.next;
		}
System.out.println();
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
Node second=head11;
		while(head11!=null)
		{
			System.out.print(head11.data+" ");
			head11=head11.next;
		}
System.out.println();
		
		Node<Integer> ans=Merge2SortedLL(first,second);
		while(ans!=null)
		{
			System.out.print(ans.data+" ");
		    ans=ans.next;
		}
		
	}
public static Node<Integer> Merge2SortedLL(Node<Integer> first,Node<Integer> second)
{
    if(first==null)return second;
    else if(second==null)return first;
	Node<Integer> ans = null;
	
	if(first.data<second.data)
	{
		ans=first;
		first=first.next;
	}
	else 
	{
		ans=second;
		second=second.next;
	}
	Node finalans=ans;
	
	while(first!=null&&second!=null)
	{
		Node nyi;
		if(first.data<=second.data)
		{
			nyi=first;
			first=first.next;		
		}
		else
		{
			nyi=second;
			second=second.next;
		}
		
			ans.next=nyi;
			ans=nyi;
		
	}
	if(first==null)
	{
		ans.next=second;
		
	}
	else if(second==null)
	{
		ans.next=first;
		
	}
	return finalans;
}

}
