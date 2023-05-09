class Solution {
    public int solution(int[][] dots) {
        int xMin = dots[0][0];
        int xMax = dots[0][0];
        int yMin = dots[0][1];
        int yMax = dots[0][1];

        for (int[] dot : dots) {
            if (dot[0] >= xMax) {
                xMax = dot[0];
            } else {
                xMin = dot[0];
            }

            if (dot[1] >= yMax) {
                yMax = dot[1];
            } else {
                yMin = dot[1];
            }
        }
        return (xMax - xMin) * (yMax - yMin);
    }
}