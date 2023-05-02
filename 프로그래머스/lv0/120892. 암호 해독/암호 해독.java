class Solution {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        String[] split = cipher.split("");

        for (int i = code - 1; i < split.length; i = i + code) {
            answer.append(split[i]);
        }

        return answer.toString();
    }
}