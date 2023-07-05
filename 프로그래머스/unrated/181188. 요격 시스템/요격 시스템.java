import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        int launchCount = 0;
        int end = 0;

        Arrays.sort(targets, Comparator.comparingInt(o -> o[1]));

        for (int[] target : targets) {
            if (target[0] >= end) {
                end = target[1];
                launchCount++;
            }
        }

        return launchCount;
    }
}