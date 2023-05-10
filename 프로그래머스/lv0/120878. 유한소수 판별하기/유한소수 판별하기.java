class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int gcd = gcd(a, b);
        a /= gcd;
        b /= gcd;

        while(b%2 == 0 || b%5 == 0) {
            if (b % 2 == 0) {
                b /= 2;
            } else if (b % 5 == 0) {
                b /= 5;
            }
        }
        if (b == 1)
            return 1;
        return 2;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}