class Solution {
    public int solution(int[] array) {
        
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        
        if (array.length == 1) {
            return array[0];
        }

        int maxCnt = -1;
        int maxKey = -1;
        int curCnt = -1;
        int curKey = -1;
        boolean dupFlag = false;

        for (int i : array) {
            if (curKey == i) {
                curCnt++;
            } else {
                curKey = i;
                curCnt = 1;
            }

            if (curCnt > maxCnt) {
                maxKey = curKey;
                maxCnt = curCnt;
                dupFlag = false;
            } else if (curCnt == maxCnt) {
                dupFlag = true;
            }
        }
        
        if (dupFlag) {
            return -1;
        } else {
            return maxKey;
        }
    }
}