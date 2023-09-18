class Solution {
    public int[] solution(int m, int n, int startX, int startY, int[][] balls) {
        int[] answer = new int[balls.length];

        int i = 0;
        for (int[] ball : balls) {
            int x = ball[0];
            int y = ball[1];

            int minDistance = Integer.MAX_VALUE;
            if (!(startX == x && startY > y)) minDistance = Math.min(minDistance, getDis(startX, x, startY, y * -1));
            if (!(startX == x && startY < y)) minDistance = Math.min(minDistance, getDis(startX, x, startY, n + (n - y)));
            if (!(startY == y && startX < x)) minDistance = Math.min(minDistance, getDis(startX, m + (m - x), startY, y));
            if (!(startY == y && startX > x)) minDistance = Math.min(minDistance, getDis(startX, x * -1, startY, y));

            answer[i++] = minDistance;
        }

        return answer;
    }

    private static int getDis(int startX, int x, int startY, int y) {
        int maxX = Math.max(startX, x);
        int minX = Math.min(startX, x);
        int maxY = Math.max(startY, y);
        int minY = Math.min(startY, y);

        return (int) Math.pow(maxX - minX, 2) + (int) Math.pow(maxY - minY, 2);
    }
}
