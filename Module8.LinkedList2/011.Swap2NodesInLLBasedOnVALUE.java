package Module8.LinkedList2;
import java.util.Scanner;

public class Swap2NodesInALinkedList {

	public static void main(String[] args) 
	{
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
		Scanner scan=new Scanner(System.in);
		Integer x=41;
		Integer y=17;
		Node<Integer>ans=Swap2NodesInLL(head11,x,y);
		while(ans!=null)
		{
			System.out.print(ans.data +" ");
			ans=ans.next;
		}	

	}
	public static Node<Integer> Swap2NodesInLL(Node<Integer> head,Integer x,Integer y)
	{
		if(x==y)return head;
		Node<Integer> prevX=null;
		Node<Integer> prevY=null;
		Node<Integer> currX=head;
		Node<Integer> currY=head;
		Node<Integer> current=head;
		
		while(current!=null)
		{
			if(current.next!=null && current.next.data==x)
			{
			prevX=current;
			currX=current.next;
			}
			if(current.next!=null && current.next.data==y)
			{
			prevY=current;
			currY=current.next;
			}
			current=current.next;
		
		}
		if(currX==null||currY==null)return head;
		if(prevX!=null)
		{
			prevX.next=currY;	
		}
		else
		{
		 head=currY;	
		}
		if(prevY!=null)
		{
			prevY.next=currX;	
		}
		else
		{
		 head=currX;	
		}
		
		
		Node temp=currX.next;
		currX.next=currY.next;
		currY.next=temp;
		
		return head;
	}
   
}
