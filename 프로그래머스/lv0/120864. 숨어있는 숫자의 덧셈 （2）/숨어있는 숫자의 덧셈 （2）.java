class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (Character.isDigit(c)) {
                temp.append(c);
                if (i == my_string.length() - 1) {
                    answer += Integer.parseInt(String.valueOf(temp));
                }
            } else if (!String.valueOf(temp).isEmpty()){
                answer += Integer.parseInt(String.valueOf(temp));
                temp = new StringBuilder();
            }
        }

        return answer;
    }
}