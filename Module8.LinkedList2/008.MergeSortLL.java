package Module8.LinkedList2;

public class MergeSortLL {

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
		Node<Integer>ans=MergeSortLL(head11);
		while(ans!=null)
		{
			System.out.print(ans.data +" ");
			ans=ans.next;
		}	
	}
	public static Node<Integer> MergeSortLL(Node<Integer> head)
	{
		if(head==null||head.next==null)
		{
			return head;
		}
		Node<Integer> mid=head;
		Node<Integer> slow=head;
		Node<Integer> fast=head;
		while(fast.next!=null&&fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		mid=slow;
		Node sec=mid.next;
		mid.next=null;
		Node<Integer>first=MergeSortLL(head);
		Node<Integer> second=MergeSortLL(sec);
		return Merge2SortedLL(first,second);
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
