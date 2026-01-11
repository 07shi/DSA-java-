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
    public ListNode recursive(ListNode l1 , ListNode l2 , int carry ) {
        if (l1 == null && l2 == null && carry == 0 ) {
            return null ; 
        }
        int n1 = (l1 != null ) ? l1.val : 0 ; 
        int n2 = (l2 != null ) ? l2.val : 0 ; 
        int sum = n1 + n2 + carry ; 
        int newcarry = sum / 10 ; 
        int digit = sum % 10 ; 
        ListNode ans = new ListNode(digit) ; 
        if (l1 != null || l2 != null || newcarry != 0 ) {
            ans.next = recursive((l1 != null ) ? l1.next : null , (l2 != null) ? l2.next : null , newcarry ) ; 
        }
        return ans ; 
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return recursive(l1 , l2 , 0 ) ; 
    }
}