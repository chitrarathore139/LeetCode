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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return head=null;
        ListNode curr=head;
        int size=0;
        while(curr.next!=null){
            size++;
            curr=curr.next;
        }
        int n= size/2;
        int iBeforeN=size-n-1;
        ListNode prev=head;
        int i=0;
        while(i<iBeforeN){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
    }
}