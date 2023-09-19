import java.util.*;

class Solution {
    static int[] dy = {-1, 1, 0, 0}; // 위 아래 오른쪽 왼쪽
    static int[] dx = {0, 0, 1, -1};
    public static int solution(String[] maps) {
        for (String map : maps) {
            System.out.println(map);
        }

        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;

        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length(); j++) {
                if (maps[i].charAt(j) == 'S') {
                    y = i;
                    x = j;
                }
            }
        }

        if (x == Integer.MAX_VALUE) {
            return -1;
        }
        
        Node L = bfs(maps, y, x, 'L');
        if (L.moveCnt == -1) {
            return -1;
        }
        
        Node E = bfs(maps, L.y, L.x, 'E');
        if (E.moveCnt == -1) {
            return -1;
        }

        return L.moveCnt + E.moveCnt;
    }

    private static Node bfs(String[] maps, int y, int x, char target) {
        int yMax = maps.length;
        int xMax = maps[0].length();

        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(y, x, 0));

        boolean[][] visited = new boolean[yMax][xMax];
        visited[y][x] = true;

        while (!q.isEmpty()) {
            Node p = q.poll();

            for (int i = 0; i < 4; i++) { // 위 아래 오른쪽 왼쪽
                int ny = p.y + dy[i];
                int nx = p.x + dx[i];
                if (ny < 0 || ny >= yMax || nx < 0 || nx >= xMax || maps[ny].charAt(nx) == 'X' || visited[ny][nx]) {
                    continue;
                }

                if (maps[ny].charAt(nx) == target) {
                    return new Node(ny, nx, p.moveCnt + 1);
                }
                q.offer(new Node(ny, nx, p.moveCnt + 1));
                visited[ny][nx] = true;
            }
        }

        return new Node(y, x, -1);
    }

    static class Node {
        int y;
        int x;
        int moveCnt;
        public Node(int y, int x, int moveCnt) {
            this.y = y;
            this.x = x;
            this.moveCnt = moveCnt;
        }
    }
}