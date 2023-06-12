class Solution {
    public int solution(int number, int limit, int power) {
        int result = 0;

        for (int num = 1; num < number + 1; num++) {
            int cnt = 0;
            for (int i = 1; i*i <= num; i++) {
                if (i * i == num) {
                    cnt++;
                } else if (num % i == 0) {
                    cnt+=2;
                }
            }
            if (cnt > limit) {
                result += power;
            } else {
                result += cnt;
            }
        }

        return result;
    }
}