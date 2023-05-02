import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
class Solution {
    public String solution(String s) {
        return Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .sorted(Map.Entry.comparingByKey())
                .map(Map.Entry::getKey)
                .collect(Collectors.joining());
    }
}