class Solution {
    public int solution(int[][] lines) {
        int answer = 0;

        answer += overlapTwoLine(lines[0], lines[1]);
        answer += overlapTwoLine(lines[0], lines[2]);
        answer += overlapTwoLine(lines[1], lines[2]);
        answer -= overlapThreeLine(lines);

        return answer;
    }
    
    private static int overlapThreeLine(int[][] lines) {
        int left = Math.max(Math.max(lines[0][0], lines[1][0]), lines[2][0]);
        int right = Math.min(Math.min(lines[0][1], lines[1][1]), lines[2][1]);
        return 2 * Math.max(right - left, 0);
    }

    private static int overlapTwoLine(int[] line1, int[] line2) {
        return Math.max(Math.min(line1[1], line2[1]) - Math.max(line1[0], line2[0]), 0);
    }
}