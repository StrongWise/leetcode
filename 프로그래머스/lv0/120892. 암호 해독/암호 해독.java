class Solution {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();

        String[] split = cipher.split("");

        for (int i = 0; i < split.length; i++) {
            if (i % code == code - 1) {
                answer.append(split[i]);
            }
        }

        return answer.toString();
    }
}