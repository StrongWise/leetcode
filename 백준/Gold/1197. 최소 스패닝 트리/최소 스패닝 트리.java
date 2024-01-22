import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    static int[] A;
    static PriorityQueue<Edge> edgeList;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int V = Integer.parseInt(s[0]);
        int E = Integer.parseInt(s[1]);

        edgeList = new PriorityQueue<>(Comparator.comparingInt(Edge::getWeight));
        for (int i = 0; i < E; i++) {
            String[] s1 = br.readLine().split(" ");
            int a = Integer.parseInt(s1[0]);
            int b = Integer.parseInt(s1[1]);
            int c = Integer.parseInt(s1[2]);
            edgeList.add(new Edge(a, b, c));
        }

        A = new int[V + 1];

        for (int i = 1; i < V + 1; i++) {
            A[i] = i;
        }

        int sum = 0;
        int edgeCount = 0;
        while (!edgeList.isEmpty()) {
            int result = union(edgeList.poll());

            if (result != 0) {
                edgeCount++;
                sum += result;
                if (edgeCount == V - 1) {
                    break;
                }
            }
        }
        System.out.println(sum);
    }

    private static int union(Edge edge) {
        int a = find(edge.getStart());
        int b = find(edge.getEnd());
        if (a != b) {
            A[b] = a;
            return edge.getWeight();
        }
        return 0;
    }
    private static int find(int n) {
        if (A[n] == n) {
            return n;
        } else {
            return A[n] = find(A[n]);
        }
    }
    private static class Edge {
        int start;
        int end;
        int weight;

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }

        public int getWeight() {
            return weight;
        }

        public Edge(int start, int end, int weight) {
            this.start = start;
            this.end = end;
            this.weight = weight;
        }
    }
}