class Solution {
    public int removeDuplicates(int[] nums) {        
        if (nums == null || nums.length == 1) {
            return 1;
        }

        int uniqueNum = 0;
        int len = nums.length;

        for (int i = 0; i < len - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                uniqueNum++;
                nums[uniqueNum] = nums[i + 1];
            }
        }

        return uniqueNum + 1;
    }
}