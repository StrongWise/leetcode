import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] ints = Arrays.stream(score).mapToInt(e -> e[0] + e[1]).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i < ints.length+1; i++) {
            if (i >= 2 && ints[i-1] == ints[i - 2]) {
                map.put(ints[i - 1], map.get(ints[i - 2]));
            } else {
                map.put(ints[i - 1], i);
            }
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = map.get(score[i][0] + score[i][1]);
        }

        return answer;
    }
}