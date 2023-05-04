class Solution {
    public int solution(int num, int k) {
        int i = String.valueOf(num).indexOf(String.valueOf(k));
        return i == -1 ? i : i +1;
    }
}