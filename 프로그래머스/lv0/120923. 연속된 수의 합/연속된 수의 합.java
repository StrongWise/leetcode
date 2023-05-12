import java.util.stream.IntStream;
class Solution {
    public int[] solution(int num, int total) {
        int pivot = total / num;
        int i = num / 2;
        return IntStream.rangeClosed(num % 2 == 1 ? pivot - i : pivot - i + 1, pivot + i).toArray();
    }
}