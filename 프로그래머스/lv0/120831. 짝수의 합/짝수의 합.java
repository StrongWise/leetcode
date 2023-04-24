class Solution {
    public int solution(int n) {
        n = n % 2 == 0 ? n : n - 1;
        int count = n / 2;

        if (count % 2 == 1) {
            return (n + 2) * (count / 2) + count + 1;
        } else {
            return (n + 2) * (count / 2);
        }
    }
}