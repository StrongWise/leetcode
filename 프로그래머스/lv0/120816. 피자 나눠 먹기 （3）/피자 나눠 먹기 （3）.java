class Solution {
    public int solution(int slice, int n) {
        int pizza = 1;

        while (true) {
            if ((pizza * slice) / n >= 1) {
                break;
            } else {
                pizza++;
            }
        }

        return pizza;
    }
}