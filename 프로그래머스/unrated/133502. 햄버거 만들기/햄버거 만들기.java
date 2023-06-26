class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;

        int[] stack = new int[ingredient.length];
        int j = 0;

        for (int i = 0; i < ingredient.length; i++) {
            stack[j] = ingredient[i];
            if (j >= 3) {
                if (stack[j-3] == 1 && stack[j-2] == 2 && stack[j-1] == 3 && stack[j] == 1){
                    stack[j-3] = 0;
                    stack[j-2] = 0;
                    stack[j-1] = 0;
                    stack[j] = 0;
                    answer++;
                    j -= 4;
                }
            }
            j++;
        }

        return answer;
    }
}