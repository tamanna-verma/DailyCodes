/*

    Following is the Node class already written for the Linked List

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
    
        public LinkedListNode(T data) {
            this.data = data;
        }
    }

*/

public class Solution {

	public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int x, int y) 
    {
        int index=0;
   	if(x==y)return head;
		LinkedListNode<Integer> prevX=null;
		LinkedListNode<Integer> prevY=null;
		LinkedListNode<Integer> currX=head;
		LinkedListNode<Integer> currY=head;
		LinkedListNode<Integer> current=head;
		
		while(current!=null)
		{
            
			if(current.next!=null && index+1==x)
			{
			prevX=current;
			currX=current.next;
			}
			if(current.next!=null && index+1==y)
			{
			prevY=current;
			currY=current.next;
			}
			current=current.next;
		 index++;
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
		
		
		LinkedListNode temp=currX.next;
		currX.next=currY.next;
		currY.next=temp;
		
		return head;
       
	   
}
}
