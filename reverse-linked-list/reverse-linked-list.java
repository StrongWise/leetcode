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
        if(head == null) {
            return null;
        }
        ListNode start = new ListNode(0, head);
        
        while(head.next != null){
            ListNode temp = new ListNode(head.next.val, start.next);
            head.next = head.next.next;
            start.next = temp;
        }
        return start.next;
    }
}