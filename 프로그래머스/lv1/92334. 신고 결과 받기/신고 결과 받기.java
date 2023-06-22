import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Integer> reportCount = new HashMap<>();
        Map<String, Integer> reported = new HashMap<>();
        for (String id : id_list) {
            reportCount.put(id, 0);
            reported.put(id, 0);
        }

        Set<String> reportSet = new HashSet<>(Arrays.asList(report));

        for (String s : reportSet) {
            String[] s1 = s.split(" ");
            reportCount.put(s1[1], reportCount.get(s1[1]) + 1);
        }

        Set<String> reportedId = new HashSet<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : reportCount.entrySet()) {
            if (stringIntegerEntry.getValue() >= k) {
                reportedId.add(stringIntegerEntry.getKey());
            }
        }

        for (String s : reportSet) {
            String[] s1 = s.split(" ");
            if (reportedId.contains(s1[1])) {
                reported.put(s1[0], reported.get(s1[0]) + 1);
            }
        }
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = reported.get(id_list[i]);
        }
        return answer;
    }
}