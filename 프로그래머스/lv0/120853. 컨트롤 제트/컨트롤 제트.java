import java.util.Objects;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            if (i + 1 >= str.length || !Objects.equals(str[i + 1], "Z"))
                if (!Objects.equals(str[i], "Z"))
                    answer += Integer.parseInt(str[i]);
        }
        return answer;
    }
}