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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int length = 0;
        
        // Calculate the length of the linked list
        while (curr != null) {
            length++;
            curr = curr.next;
        }
        
        // If n is equal to the length, remove the head node
        if (n == length) {
            return head.next;
        }
        
        // Find the node just before the one we need to remove
        ListNode prev = head;
        for (int i = 1; i < length - n; i++) {
            prev = prev.next;
        }
        
        // Remove the nth node from the end
        prev.next = prev.next.next;
        
        return head;
    }
}
