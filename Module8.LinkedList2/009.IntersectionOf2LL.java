/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution 
{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB)
    {
        if(headA==null||headB==null)return null;
      int size1=Size(headA);
        //System.out.println(size1);
        
      int size2=Size(headB);
         // System.out.println(size2);
        if(size1>size2)
        {
            while(size1>size2)
            {
               
                   headA=headA.next; 
                   size1--;
                
            }
        }
        else if(size2>size1)
        {
            while(size2>size1)
            {
                
                headB=headB.next;
                size2--;
            }
        }
        
        while(headA!=null&&headB!=null)
        {
            if(headA==headB)
            {
                return headA;
            }
            else
            {
             headA=headA.next;
             headB=headB.next;
            }
        }
      return null;
    }
    public static int Size(ListNode head)
    {
        if(head==null)
        {
            return -1;
        }else if(head.next==null)
        {
            return 1;
        }
        int x=Size(head.next);
        return (x!=-1?x+1:-1);
    }
    
}
