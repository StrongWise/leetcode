import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {

        Map<Integer, Integer> reward = new HashMap<>();
        reward.put(6, 1);
        reward.put(5, 2);
        reward.put(4, 3);
        reward.put(3, 4);
        reward.put(2, 5);
        reward.put(1, 6);
        reward.put(0, 6);

        int sameCnt = 0;
        int unknownCnt = 0;

        for (int i = 0; i < lottos.length; i++) {
            int lotto = lottos[i];
            for (int j = 0; j < win_nums.length; j++) {
                if (lotto == win_nums[j]) {
                    sameCnt++;
                }
            }
            if (lotto == 0) {
                unknownCnt++;
            }
        }

        int max = unknownCnt + sameCnt;
        int min = sameCnt;

        return new int[] {reward.get(max), reward.get(min)};
    }
}