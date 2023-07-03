import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();

        Map<Integer, Integer> mapX = new HashMap<>();
        Map<Integer, Integer> mapY = new HashMap<>();

        for (int i = 0; i < X.length(); i++) {
            Integer num = Integer.parseInt(X.substring(i, i + 1));
            mapX.put(num, (mapX.get(num) == null ? 0 : mapX.get(num)) + 1);
        }
        for (int i = 0; i < Y.length(); i++) {
            Integer num = Integer.parseInt(Y.substring(i, i + 1));
            mapY.put(num, (mapY.get(num) == null ? 0 : mapY.get(num)) + 1);
        }

        for (int i = 9; i >= 0; i--) {
            Integer xx = mapX.get(i);
            Integer yy = mapY.get(i);

            if (xx != null && yy != null) {
                int min = Math.min(xx, yy);
                if (i == 0 && answer.length() == 0) min = 1;
                answer.append((i + "").repeat(min));
            }
        }

        if (answer.length() == 0) {
            return "-1";
        }

        return answer.toString();
    }
}