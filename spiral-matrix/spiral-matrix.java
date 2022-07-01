class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> result = new ArrayList<>();

        int up = 0;
        int down = mat.length - 1;
        int left = 0;
        int right = mat[0].length - 1;

        while (up <= down && left <= right) {
            for (int i = left; i <= right; i++) {
                result.add(mat[up][i]);
            }
            up++;

            for (int i = up; i <= down; i++) {
                result.add(mat[i][right]);
            }
            right--;

            if (up <= down) {
                for (int i = right; i >= left; i--) {
                    result.add(mat[down][i]);
                }
            }
            down--;

            if (left <= right) {
                for (int i = down; i >= up; i--) {
                    result.add(mat[i][left]);
                }
            }
            left++;
        }
        return result;
    }
}