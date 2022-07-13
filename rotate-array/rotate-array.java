class Solution {
    public void rotate(int[] nums, int k) {
        int[] result = Arrays.copyOf(nums, nums.length);
        int idx = 0;
        
        k = k % nums.length;
        for (int i = nums.length - k; i < nums.length; i++) {
            nums[idx++] = result[i];
        }
        for (int i = 0; i < nums.length - k; i++) {
            nums[idx++] = result[i];
        }
    }
}