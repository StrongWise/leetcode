class Solution {
    public int solution(int num, int k) {
        String s = String.valueOf(num);
        for (int i = 0; i < s.length(); i++) {
            if (Integer.parseInt(s.charAt(i) + "") == k) {
                return i + 1;
            }
        }

        return -1;
    }
}