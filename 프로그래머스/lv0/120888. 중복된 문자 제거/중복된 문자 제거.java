import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] split = my_string.split("");
        Set<String> set = new LinkedHashSet<>(Arrays.asList(split));

        for (String s : set) {
            answer += s;
        }
        return answer;
    }
}