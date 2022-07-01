class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        List<Integer> result = new ArrayList<>();

        int row = mat.length;
        int col = mat[0].length;

        for (int i = 0; i < row + col - 1; i++) {
            ArrayList<Integer> subList = new ArrayList<>();

            int x = i < col ? 0 : i - col + 1;
            int y = i < col ? i : col - 1;

            while (x < row && y > -1) {
                subList.add(mat[x][y]);
                x++;
                y--;
            }

            if (i % 2 == 0) {
                Collections.reverse(subList);
            }
            result.addAll(subList);
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}