/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head==null || head.next==null)
        {
            return head;
        }

        ListNode preNode=head;
        ListNode curr=head.next;
        while(curr!=null)
        {
            ListNode nextnode=curr.next;
            curr.next=preNode;
            preNode=curr;
            curr=nextnode;


        }
        head.next=null;
        head=preNode;
        return head;
    }
}