class Solution {
    public int solution(String my_string) {
        String[] s = my_string.split(" ");
        int answer = Integer.parseInt(s[0]);

        for (int i = 0; i < s.length - 2; i++) {
            if ("+".equals(s[i + 1])) {
                answer += Integer.parseInt(s[i + 2]);
            } else if ("-".equals(s[i + 1])) {
                answer -= Integer.parseInt(s[i + 2]);
            }
        }

        return answer;
    }
}