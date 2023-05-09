class Solution {
    public int solution(int[][] board) {
        int answer = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (getAnswer(board, i-1, j-1)) {
                    answer++;
                } else if (getAnswer(board, i, j-1)) {
                    answer++;
                } else if (getAnswer(board, i+1, j-1)) {
                    answer++;
                } else if (getAnswer(board, i-1, j)) {
                    answer++;
                } else if (getAnswer(board, i, j)) {
                    answer++;
                } else if (getAnswer(board, i+1, j)) {
                    answer++;
                } else if (getAnswer(board, i-1, j+1)) {
                    answer++;
                } else if (getAnswer(board, i, j+1)) {
                    answer++;
                } else if (getAnswer(board, i+1, j+1)) {
                    answer++;
                }
            }
        }

        return board.length * board.length - answer;
    }
    
    private static boolean getAnswer(int[][] board, int i, int j) {
        try {
            if (board[i][j] == 1) {
                return true;
            }
        } catch (IndexOutOfBoundsException e) {
            // do nothing
        }
        return false;
    }
}