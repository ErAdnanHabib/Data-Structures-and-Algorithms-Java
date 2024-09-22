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
    public ListNode rotateRight(ListNode head, int k) {

        if(head==null)return null;

        int len = 1;
        ListNode tail = head;
        while(tail.next != null){
            len++;
            tail=tail.next;
        } 
        if(k % len == 0)return head;
        k = k % len;

        ListNode newTail = head;
        for(int i=1 ; i<(len-k) ; i++){
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;

        newTail.next= null;
        tail.next=head;
        return newHead;


        
    }
}