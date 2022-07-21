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
        ListNode start = new ListNode(0, head);
        ListNode slow = start;
        ListNode fast = start.next;
        
        while(fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next;
            
            ListNode temp = new ListNode(fast.next.val, slow.next);
            slow.next = temp;
            fast.next = fast.next.next;
        }
        
        return start.next;
    }
}