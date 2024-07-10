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
    public ListNode oddEvenList(ListNode head) {
        ListNode newOdd=new ListNode(-1);
        ListNode newEven=new ListNode(-1);
        ListNode currOdd=newOdd;
        ListNode currEven=newEven;
        ListNode curr=head;
        int count=1;
        
        while(curr!=null){
            if((count%2)!=0){
                currOdd.next=curr;
                currOdd=currOdd.next;
            }else{
                currEven.next=curr;
                currEven=currEven.next;
            }
            curr=curr.next;
            count++;
        }
        currOdd.next=newEven.next;
        currEven.next=null;
        return newOdd.next;

        
    }
}