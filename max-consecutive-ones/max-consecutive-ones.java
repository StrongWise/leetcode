class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxLen = 0;
        int subLen = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                subLen++; 
            } else {
                if (maxLen < subLen) {
                    maxLen = subLen;
                }
                subLen = 0;
            }
        }
        if(maxLen < subLen) {
            maxLen = subLen;
        }
        return maxLen;
        
    }
}