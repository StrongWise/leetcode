import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 1;
        
        List<Map.Entry<Integer, Long>> sortedList = Arrays.stream(tangerine)
                .boxed()
                .collect(Collectors.toList())
                .stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
                .collect(Collectors.toList());

        for (Map.Entry<Integer, Long> l : sortedList) {
            k -= l.getValue();
            if (k <= 0) {
                return answer;
            }
            answer++;
        }

        return answer;
    }
}