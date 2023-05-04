import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        Set<String> list1 = new HashSet<>(Arrays.asList(s1));
        Set<String> list2 = new HashSet<>(Arrays.asList(s2));

        for (String str1 : list1) {
            if (list2.contains(str1)) {
                answer++;
                list2.remove(str1);
            }
        }

        return answer;
    }
}