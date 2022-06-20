class Solution {
    public int heightChecker(int[] heights) {
        int notMatchCount = 0;
        int[] orderedNums = Arrays.copyOf(heights, heights.length);
        Arrays.sort(orderedNums);
        
        for (int i = 0; i < heights.length; i++) {
            System.out.println(heights[i] + " : " + orderedNums[i]);
            if (heights[i] != orderedNums[i]) {
                notMatchCount++;
            }
        }

        return notMatchCount;
    }
}