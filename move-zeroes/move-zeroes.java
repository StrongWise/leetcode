class Solution {
    public void moveZeroes(int[] nums) {
        int zeroIdx = 0;
        int len = nums.length;

        for (int i = 0; i < len - 1; i++) {
            if (nums[i] == 0) {
                zeroIdx = i;
                break;
            }
        }
        
        if (len > 1) {
            for (int i = zeroIdx; i < len - 1; i++) {
                if (nums[i] == 0 && nums[i + 1] != 0) {
                    nums[zeroIdx] = nums[i + 1];
                    nums[i + 1] = 0;
                    zeroIdx++;
                }
            }
        }
    }
}