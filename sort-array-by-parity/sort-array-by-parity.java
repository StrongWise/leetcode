class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if (nums == null || nums.length == 1) {
            return nums;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            for (int i = left; i < right; i++) {
                if (nums[left] % 2 == 1) {
                    break;
                } else {
                    left++;
                }
            }

            for (int i = right; i > left; i--) {
                if (nums[right] % 2 == 0) {
                    break;
                } else {
                    right--;
                }
            }

            if (nums[left] % 2 == 1 && nums[right] % 2 == 0) {
                nums[left] = nums[left] + nums[right];
                nums[right] = nums[left] - nums[right];
                nums[left] = nums[left] - nums[right];
            }
        }

        return nums;
    }
}