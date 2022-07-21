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
    public boolean isPalindrome(ListNode head) {
        List<Integer> nums = new ArrayList<>();
        while(head != null){
            nums.add(head.val);
            head = head.next;
        }
        
        int start = 0;
        int end = nums.size() - 1;
        while(start < end){
            if(nums.get(start) == nums.get(end)){
                start++;
                end--;
            } else {
                return false;
            }
        }
        
        return true;
    }
}