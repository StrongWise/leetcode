import java.util.*;
class Solution {
    public int[] solution(int n) {
        Set<Integer> list = new HashSet<>();
        int d = 1;
        while (n > d) {
            d++;
            if (n % d == 0) {
                list.add(d);
                n = n / d--;
            }
        }

        return list.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}