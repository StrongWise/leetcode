import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();
        for (String keys : keymap) {
            for (int i = 1; i <= keys.length(); i++) {
                if (map.get(keys.charAt(i - 1)) == null) {
                    map.put(keys.charAt(i - 1), i);
                } else if (map.get(keys.charAt(i - 1)) > i){
                    map.put(keys.charAt(i - 1), i);
                }

            }
        }

        int idx = 0;
        for (String target : targets) {
            Map<Character, Integer> countMap = new HashMap<>();
            for (int i = 0; i < target.length(); i++) {
                char c = target.charAt(i);
                if (countMap.get(c) == null) {
                    countMap.put(c, 1);
                } else {
                    Integer val = countMap.get(c);
                    countMap.put(c, ++val);
                }
            }

            int sum = 0;
            for (Map.Entry<Character, Integer> countMapEntry : countMap.entrySet()) {
                Character ch = countMapEntry.getKey();
                Integer cnt = countMapEntry.getValue();
                if (map.get(ch) == null) {
                    sum = -1;
                    break;
                } else {
                    sum += map.get(ch) * cnt;
                }
            }

            answer[idx++] = sum;
        }

        return answer;
    }
}