import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        int[] ints = before.chars().sorted().toArray();
        int[] ints2 = after.chars().sorted().toArray();
        return Arrays.equals(ints, ints2) ? 1 : 0;
    }
}