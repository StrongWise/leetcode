class Solution {
    public int solution(int[] array, int n) {
        int diff = Integer.MAX_VALUE;
        int idx = 0;
        for (int i = 0; i < array.length; i++) {
            int newDiff = (n < array[i]) ? array[i] - n : n - array[i];
            if (diff > newDiff) {
                diff = newDiff;
                idx = i;
            } else if (diff == newDiff && array[idx] > array[i]) {
                idx = i;
            }
        }
        return array[idx];
    }
}