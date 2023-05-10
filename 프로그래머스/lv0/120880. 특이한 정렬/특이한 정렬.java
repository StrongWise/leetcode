import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        return Arrays.stream(numlist).boxed().sorted((o1, o2) -> {
            if (Math.abs(o1 - n) == Math.abs(o2 - n)) {
                return o2 - o1;
            }
            return Math.abs(o1 - n) - Math.abs(o2 - n);
        }).mapToInt(Integer::intValue)
        .toArray();
    }
}