import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> result = new ArrayList<>();

        String[] todays = today.split("\\.");
        Integer year = Integer.parseInt(todays[0]);
        Integer month = Integer.parseInt(todays[1]);
        Integer day = Integer.parseInt(todays[2]);

        Map<String, Integer> map = new HashMap<>();
        for (String term : terms) {
            String[] s = term.split(" ");
            map.put(s[0], Integer.parseInt(s[1]));
        }

        for (int i = 0; i < privacies.length; i++) {
            String[] pr = privacies[i].split(" ");
            String collectDay = pr[0];
            String no = pr[1];

            String[] cd = collectDay.split("\\.");
            Integer cYear = Integer.parseInt(cd[0]);
            Integer cMonth = Integer.parseInt(cd[1]);
            Integer cDay = Integer.parseInt(cd[2]);

            cYear += (cMonth + map.get(no) - 1) / 12;
            cMonth = (cMonth + map.get(no) - 1) % 12 + 1;
            if (year > cYear) {
                result.add(i);
            } else if (year.equals(cYear) && month > cMonth) {
                result.add(i);
            } else if (year.equals(cYear) && month.equals(cMonth) && day >= cDay) {
                result.add(i);
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i) + 1;
        }
        return answer;
    }
}