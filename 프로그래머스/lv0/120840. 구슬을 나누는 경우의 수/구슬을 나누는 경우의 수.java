import java.math.BigInteger;
class Solution {
    public int solution(int balls, int share) {

        BigInteger up = BigInteger.ONE;

        for (int i = balls; i > share; i--) {
            up = up.multiply(BigInteger.valueOf(i));
        }

        BigInteger down = BigInteger.ONE;

        for (int i = balls - share; i > 0; i--) {
            down = down.multiply(BigInteger.valueOf(i));
        }

        return up.divide(down).intValue();
    }
}