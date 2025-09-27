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
        // making copy of nodes in between 
        Node temp = head ; 
        while (temp != null ) {
            Node c = new Node(temp.val) ; 
            c.next = temp.next ; 
            temp.next = c ; 
            temp = temp.next.next ; 
        }
        // now joining the random pointers
        temp = head ; 
        while (temp != null ) {
            if(temp.random != null ) {
                temp.next.random = temp.random.next ; 
            }else {
                temp.next.random = null ; 
            }
            temp = temp.next.next    ; 
        }
        // now just remove the first nodes which are given
        Node dummy = new Node(-1) ; 
        Node d = dummy ; 
        temp = head ; 
        while (temp != null ) {
            Node copy = temp.next ; 
            temp.next = copy.next ; 
            d.next = copy ; 
            d = d.next ; 
            temp = temp.next ;  
        }
        return dummy.next ; 
    }
}