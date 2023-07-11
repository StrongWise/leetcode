class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[] {0, Integer.MAX_VALUE};

        int sp = 0;
        int ep = 0;
        int sum = sequence[sp];
        int n = sequence.length;

        while (true) {
            if (sum == k && (answer[1] - answer[0] > ep - sp)) {
                answer[0] = sp;
                answer[1] = ep;
            }
            if (sp == n && ep == n) {
                break;
            }

            if (sum <= k && ep <   n) {
                ep++;
                if (ep < n) {
                    sum += sequence[ep];
                }
            } else  {
                if (sp < n) {
                    sum -= sequence[sp];
                }
                sp++;
            }
        }

        return answer;
    }
}