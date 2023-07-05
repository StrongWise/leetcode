import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        Arrays.sort(stages);
        int cnt = 0;
        int curStage = stages[0];
        int remainUserCnt = stages.length;
        Map<Integer, Double> rate = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            rate.put(i, 0.0);
        }

        for (int i = 0; i < stages.length; i++) {
            if (stages[i] != curStage) {
                rate.put(curStage , (double) cnt / remainUserCnt);
                curStage = stages[i];
                remainUserCnt -= cnt;
                cnt = 1;
            } else {
                cnt++;
            }
        }
        if (remainUserCnt >= 1 && rate.get(curStage) != null) {
            rate.put(curStage, (double) cnt / remainUserCnt);
        }


        List<Map.Entry<Integer, Double>> entries = new ArrayList<>(rate.entrySet());
        entries.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        int[] answer = new int[entries.size()];
        for (int i = 0; i < entries.size(); i++) {
            answer[i] = entries.get(i).getKey();
        }

        return answer;
    }
}