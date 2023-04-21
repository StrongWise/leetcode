import java.util.*;

class Solution {
    public double solution(int[] numbers) {
        OptionalDouble average = Arrays.stream(numbers).average();
        if (average.isPresent()) {
            return average.getAsDouble();
        } else {
            return 0;
        }
    }
}