class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        Boolean[] counter = new Boolean[nums.length];
        Arrays.fill(counter, false);

        for (int i = 0; i < nums.length; i++) {
            counter[nums[i] - 1] = true;
        }

        List<Integer> output = new ArrayList<>();

        for (int i = 0; i < counter.length; i++) {
            if (!counter[i]) {
                output.add(i + 1);
            }
        }

        return output;
    }
}