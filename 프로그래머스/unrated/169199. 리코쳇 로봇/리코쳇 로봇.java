import java.util.*;
class Solution {

    private static final int[] dx = {-1, 1, 0, 0};
    private static final int[] dy = {0, 0, -1, 1};

    private static int row;
    private static int col;

    public static int solution(String[] board) {
        row = board.length;
        col = board[0].length();

        Position R = null;
        Position G = null;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                char ch = board[i].charAt(j);

                if (ch == 'R') {
                    R = new Position(i, j, 0);
                } else if (ch == 'G') {
                    G = new Position(i, j, 0);
                }
            }
        }

        return bfs(board, R, G);
    }

    private static int bfs(String[] board, Position R, Position G) {
        Queue<Position> movingQueue = new LinkedList<>();
        movingQueue.add(R);
        boolean[][] isVisit = new boolean[row][col];
        isVisit[R.getX()][R.getY()] = true;

        while (!movingQueue.isEmpty()) {
            Position pos = movingQueue.poll();
            if (pos.getX() == G.getX() && pos.getY() == G.getY()) {
                return pos.getDepth();
            }

            for (int i = 0; i < 4; i++) {
                int xPos = pos.getX();
                int yPos = pos.getY();

                while (xPos >= 0 && yPos >= 0 && xPos < row && yPos < col && board[xPos].charAt(yPos) != 'D') {
                    xPos += dx[i];
                    yPos += dy[i];
                }

                xPos -= dx[i];
                yPos -= dy[i];

                if (isVisit[xPos][yPos] || (pos.getX() == xPos && pos.getY() == yPos)) {
                    continue;
                }

                isVisit[xPos][yPos] = true;
                movingQueue.add(new Position(xPos, yPos, pos.getDepth() + 1));
            }
        }

        return -1;
    }

    private static class Position {
        private final int x;
        private final int y;
        private final int depth;

        public Position(int x, int y, int depth) {
            this.x = x;
            this.y = y;
            this.depth = depth;
        }

        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }
        public int getDepth() {
            return depth;
        }
    }

}
