import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        List<String> list = new ArrayList<>();

        while (my_str.length() > n) {
            list.add(my_str.substring(0, n));
            my_str = my_str.substring(n);
        }
        list.add(my_str);

        return list.toArray(String[]::new);
    }
}