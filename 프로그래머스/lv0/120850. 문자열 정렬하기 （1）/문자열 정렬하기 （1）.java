import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        return Arrays.stream(my_string.replaceAll("\\D", "").split("")).mapToInt(Integer::parseInt).sorted().toArray();
    }
}