class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;

        List<Integer> result = new ArrayList<>();

        int sum = row + col;

        for (int k = 0; k < sum - 1; k++) {
            List<Integer> subList = new ArrayList<>();
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if ((i + j == k)) {
                        subList.add(mat[i][j]);
                    }
                }
            }
            if (k % 2 == 0) {
                Collections.reverse(subList);
            }
            result.addAll(subList);
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}