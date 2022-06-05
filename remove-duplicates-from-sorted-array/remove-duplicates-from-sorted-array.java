class Solution {
    public int removeDuplicates(int[] nums) {
        int num = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[num] = nums[i + 1];
                num++;
            }
        }
        
        return num;
    }
}