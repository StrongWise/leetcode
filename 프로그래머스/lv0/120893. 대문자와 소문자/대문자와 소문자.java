class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (c > 96) {
                answer.append(Character.toString(c - 32));
            } else {
                answer.append(Character.toString(c + 32));;
            }
        }
        return answer.toString();
    }
}