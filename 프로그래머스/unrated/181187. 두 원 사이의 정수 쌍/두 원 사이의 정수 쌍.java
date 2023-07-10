class Solution {
    public long solution(int r1, int r2) {
        long answer = 0;

        for (long x = 1; x <= r2; x++) {
            long start = (long) Math.ceil(Math.sqrt(Math.pow(r1, 2) - Math.pow(x, 2)));
            long end = (long) Math.floor(Math.sqrt(Math.pow(r2, 2) - Math.pow(x, 2)));
            answer = answer + end - start + 1;
        }

        return answer * 4;
    }
}