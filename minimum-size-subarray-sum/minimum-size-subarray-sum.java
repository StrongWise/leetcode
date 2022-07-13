class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int end = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        while (end < nums.length) {
            sum += nums[end];
            if (sum < target) {
                end++;
            } else {
                minLen = Math.min(minLen, end - start + 1);
                sum = sum - nums[start] - nums[end];
                start++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}