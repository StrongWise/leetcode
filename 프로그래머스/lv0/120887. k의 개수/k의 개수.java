class Solution {
    public int solution(int i, int j, int k) {
        StringBuilder sb = new StringBuilder();
        for (int n = i; n <= j; n++) {
            sb.append(n);
        }
        return sb.toString().length() - sb.toString().replace(String.valueOf(k), "").length();
    }
}