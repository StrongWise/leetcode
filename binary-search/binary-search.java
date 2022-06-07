class Solution {
    public int search(int[] nums, int target) {
        int p = nums.length / 2; // 3
        int start = 0;
        int end = nums.length - 1; // 5

        while (start <= end) {
            p = (start + end) / 2;
            if (nums[p] == target) {
                return p;
            } else if (nums[p] < target) {
                start = p + 1;
            } else {
                end = p - 1;
            }
        }
        return -1;
    }
}