/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;

        Node curr = head;

        while(curr != null){
            Node newNode = new Node(curr.val);
            newNode.next = curr.next;
            curr.next= newNode;
            curr = newNode.next;
        }

        curr=head;
        while(curr !=null){
            if(curr.random != null){
                curr.next.random = curr.random.next;
            }
            curr=curr.next.next;
        }

        curr=head;

        Node newHead = head.next;
        Node newCurr = newHead;

        while(curr != null){
            Node temp  = curr.next.next;
            curr.next = temp;
            curr = temp;
            if(temp != null){
                newCurr.next = temp.next;
                newCurr = newCurr.next;
            }
        }
        return newHead;
        
    }
}