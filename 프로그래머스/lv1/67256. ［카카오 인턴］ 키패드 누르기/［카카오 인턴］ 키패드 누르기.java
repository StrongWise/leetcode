import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        Map<String, String> np = new HashMap<>();
        np.put("1", "03");np.put("2", "13");np.put("3", "23");
        np.put("4", "02");np.put("5", "12");np.put("6", "22");
        np.put("7", "01");np.put("8", "11");np.put("9", "21");
        np.put("*", "00");np.put("0", "10");np.put("#", "20");

        String lPos = "00";
        String rPos = "20";

        for (int num : numbers) {
            String numberPosition = np.get(String.valueOf(num));
            boolean flag;
            if (num == 1 || num == 4 || num == 7) {
                flag = true;
            } else if (num == 3 || num == 6 || num == 9) {
                flag = false;
            } else {
                int n1 = numberPosition.charAt(0) - '0';
                int n2 = numberPosition.charAt(1) - '0';
                int l1 = lPos.charAt(0) - '0';
                int l2 = lPos.charAt(1) - '0';
                int r1 = rPos.charAt(0) - '0';
                int r2 = rPos.charAt(1) - '0';

                int dl = Math.abs(n1 - l1) + Math.abs(n2 - l2);
                int dr = Math.abs(n1 - r1) + Math.abs(n2 - r2);
                if (dl > dr) {
                    flag = false;
                } else if (dl < dr){
                    flag = true;
                } else {
                    flag = !hand.equals("right");
                }
            }

            if (flag) {
                answer.append("L");
                lPos = numberPosition;
            } else {
                answer.append("R");
                rPos = numberPosition;
            }
        }

        return answer.toString();
    }
}