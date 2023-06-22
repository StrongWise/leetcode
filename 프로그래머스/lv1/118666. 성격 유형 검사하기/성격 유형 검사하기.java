import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("R", 0);
        map.put("T", 0);
        map.put("C", 0);
        map.put("F", 0);
        map.put("J", 0);
        map.put("M", 0);
        map.put("A", 0);
        map.put("N", 0);


        for (int i = 0; i < survey.length; i++) {
            if (choices[i]-4 < 0) {
                String charactor = String.valueOf(survey[i].charAt(0));
                int score = Math.abs(choices[i] - 4);
                map.put(charactor, map.get(charactor) + score);
            } else if (choices[i]-4 > 0) {
                String charactor = String.valueOf(survey[i].charAt(1));
                int score = Math.abs(choices[i] - 4);
                map.put(charactor, map.get(charactor) + score);
            }
        }

        List<String> list = List.of("RT", "CF", "JM", "AN");
        StringBuilder sb = new StringBuilder();

        for (String s : list) {
            String key1 = String.valueOf(s.charAt(0));
            String key2 = String.valueOf(s.charAt(1));
            Integer score1 = map.get(key1);
            Integer score2 = map.get(key2);
            if (score1 >= score2) {
                sb.append(key1);
            } else {
                sb.append(key2);
            }
        }

        return sb.toString();
    }
}