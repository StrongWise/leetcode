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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode cur = result;
        int carry = 0;
        int val1 = 0;
        int val2 = 0;
        
        if(l1 != null || l2 != null){
            result.val = (l1.val + l2.val) % 10;
            carry = (l1.val + l2.val) / 10;
            l1 = l1.next;
            l2 = l2.next;
        }
        
        while(l1 != null || l2 != null){
            if(l1 != null){
                val1 = l1.val;
            } else {
                val1 = 0;
            }
            if(l2 != null){
                val2 = l2.val;
            } else {
                val2 = 0;
            }
            cur.next = new ListNode((val1 + val2 + carry) % 10);
            carry = (val1 + val2 + carry) / 10;
            cur = cur.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        
        if(carry != 0){
            cur.next = new ListNode(carry);
        }
        return result;
    }
}