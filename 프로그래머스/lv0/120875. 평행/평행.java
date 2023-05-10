class Solution {
    public int solution(int[][] dots) {
        double x1, x2, y1, y2 = 0;
        x1 = dots[0][0] - dots[1][0];
        x2 = dots[0][1] - dots[1][1];
        y1 = dots[2][0] - dots[3][0];
        y2 = dots[2][1] - dots[3][1];
        if (x1 / x2 == y1 / y2) {
            return 1;
        }

        x1 = dots[0][0] - dots[2][0];
        x2 = dots[0][1] - dots[2][1];
        y1 = dots[1][0] - dots[3][0];
        y2 = dots[1][1] - dots[3][1];
        if (x1 / x2 == y1 / y2) {
            return 1;
        }

        x1 = dots[0][0] - dots[3][0];
        x2 = dots[0][1] - dots[3][1];
        y1 = dots[1][0] - dots[2][0];
        y2 = dots[1][1] - dots[2][1];
        if (x1 / x2 == y1 / y2) {
            return 1;
        }
        return 0;
    }
}