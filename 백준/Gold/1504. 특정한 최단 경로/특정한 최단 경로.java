import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Main {
    static int N, E;
    static ArrayList<Node>[] A;
    static int[] D;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        N = Integer.parseInt(s[0]);
        E = Integer.parseInt(s[1]);

        A = new ArrayList[N + 1];
        D = new int[N + 1];
        visited = new boolean[N + 1];
        for (int i = 0; i < N + 1; i++) {
            A[i] = new ArrayList<>();

        }

        for (int i = 0; i < E; i++) {
            String[] s1 = br.readLine().split(" ");
            int start = Integer.parseInt(s1[0]);
            int end = Integer.parseInt(s1[1]);
            int dist = Integer.parseInt(s1[2]);

            A[start].add(new Node(end, dist));
            A[end].add(new Node(start, dist));
        }

        String[] s2 = br.readLine().split(" ");
        int v1 = Integer.parseInt(s2[0]);
        int v2 = Integer.parseInt(s2[1]);

        int wayA = findWay(1, v1);
        wayA += findWay(v1, v2);
        wayA += findWay(v2, N);

        int wayB = findWay(1, v2);
        wayB += findWay(v2, v1);
        wayB += findWay(v1, N);

        if (wayA >= 200000000 && wayB >= 200000000) {
            System.out.println(-1);
        } else if (wayA > wayB) {
            System.out.println(wayB);
        } else {
            System.out.println(wayA);
        }
    }

    private static int findWay(int a, int b) {
        for (int i = 1; i <= N; i++) {
            if (a == i) {
                D[i] = 0;
            } else {
                D[i] = 200000000;
            }
            visited[i] = false;
        }

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(a, 0));

        while (!pq.isEmpty()) {
            Node now = pq.poll();

            if (visited[now.end]) {
                continue;
            }
            visited[now.end] = true;

            for (Node next : A[now.end]) {
                if (D[next.end] > next.dist + now.dist) {
                    D[next.end] = next.dist + now.dist;
                    pq.add(new Node(next.end, D[next.end]));
                }
            }

        }

        return D[b];
    }

    static class Node implements Comparable<Node> {
        int end;
        int dist;

        public Node(int end, int dist) {
            this.end = end;
            this.dist = dist;
        }

        @Override
        public int compareTo(Node node) {
            return this.dist - node.dist;
        }
    }
}