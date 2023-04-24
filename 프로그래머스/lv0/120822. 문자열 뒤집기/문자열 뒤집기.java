class Solution {
    public String solution(String my_string) {
        char[] chars = my_string.toCharArray();
        String result = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            result += chars[i];
        }

        return result;
    }
}