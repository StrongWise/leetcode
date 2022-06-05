class Solution {
    public int removeElement(int[] nums, int val) {
        int p1 = 0;
        int p2 = nums.length - 1;

        int p = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[p++] = nums[i];
            }
        }
        
        return p;
    }
}