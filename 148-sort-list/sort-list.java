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
    public ListNode sortList(ListNode head) {
        PriorityQueue<Integer> queue =new PriorityQueue<>();
        ListNode newHead = new ListNode(-1);
        ListNode curr = newHead;
        while(head!=null){
            queue.add(head.val);
            head=head.next;
        }
        while(!queue.isEmpty()){
            curr.next=new ListNode(queue.poll());
            curr=curr.next;
        }
        return newHead.next;
        
    }
}