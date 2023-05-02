import java.util.Arrays;

class Solution {
    public int solution(int order) {
        return (int) Arrays.stream(String.valueOf(order).split("")).filter(e -> e.equals("3") || e.equals("6") || e.equals("9")).count();
    }
}