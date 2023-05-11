import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
class Solution {
    public int solution(int i, int j, int k) {
        AtomicInteger answer = new AtomicInteger();
        IntStream.rangeClosed(i, j).forEach(n -> answer.addAndGet((int) Arrays.stream(String.valueOf(n).split("")).filter(e -> Integer.parseInt(e) == k).count()));
        return answer.get();
    }
}