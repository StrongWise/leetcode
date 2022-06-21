class Solution {
    public int thirdMax(int[] nums) {
        nums = Arrays.stream(nums).sorted().distinct().toArray();
        if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return nums[0] > nums[1] ? nums[0] : nums[1];
        }


        return nums[nums.length - 3];
    }
}