import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] emergency) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> collect = Arrays.stream(emergency)
                .boxed()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        for (int i = 0; i < collect.size(); i++) {
            map.put(collect.get(i), i + 1);
        }

        int[] answer = new int[emergency.length];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = map.get(emergency[i]);
        }

        return answer;
    }
}