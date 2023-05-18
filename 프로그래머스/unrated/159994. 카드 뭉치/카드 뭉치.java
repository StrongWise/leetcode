import java.util.Objects;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < goal.length; i++) {
            if (cards1.length > c1 && Objects.equals(goal[i], cards1[c1])) {
                c1++;
            } else if (cards2.length > c2 && Objects.equals(goal[i], cards2[c2])) {
                c2++;
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}