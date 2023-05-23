class Solution {
    public int solution(String s) {
        char x = s.charAt(0);
        int same = 0;
        int diff = 0;
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            if (same == diff) {
                answer++;
                x = s.charAt(i);
            }
            if (x == s.charAt(i)) {
                same++;
            } else {
                diff++;
            }
        }

        return answer;
    }
}