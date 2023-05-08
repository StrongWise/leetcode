class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int i : array)
            answer += String.valueOf(i).chars().filter(e -> e == '7').count();
        return answer;
    }
}