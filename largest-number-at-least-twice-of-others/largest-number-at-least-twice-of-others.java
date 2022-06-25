class Solution {
    public int dominantIndex(int[] nums) {
        int tempMax = -1, index = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > tempMax) {
                tempMax = nums[i];
                index = i;
            }
        }

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] * 2 > tempMax && nums[i] != tempMax)
                return -1;
        }
        return index;
    }
}