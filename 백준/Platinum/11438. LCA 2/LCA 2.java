
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Integer>[] A;
    static int[][] parent;
    static int[] depth;
    static int K, N, M;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        K = 0;
        int temp = 1;
        while (temp <= N) {
            temp <<= 1;
            K++;
        }
        A = new ArrayList[N + 1];
        parent = new int[K + 1][N + 1];
        depth = new int[N + 1];
        for (int i = 0; i < N + 1; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            A[a].add(b);
            A[b].add(a);
        }

        dfs(1,1,0);

        // 공통 조상 찾기
        M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            String[] s = br.readLine().split(" ");
            System.out.println(executeLCA(Integer.parseInt(s[0]), Integer.parseInt(s[1])));
        }
    }

    private static int executeLCA(int shallow, int deep) {
        if (depth[shallow] > depth[deep]) {
            int temp = shallow;
            shallow = deep;
            deep = temp;
        }
        for (int k = K; k >= 0; k--) {
            if (Math.pow(2, k) <= depth[deep] - depth[shallow]) {
                deep = parent[k][deep];
            }
        }

        for (int k = K; k >= 0; k--) {
            if (parent[k][shallow] != parent[k][deep]) {
                shallow = parent[k][shallow];
                deep = parent[k][deep];
            }
        }

        int LCA = shallow;
        if (shallow != deep) {
            LCA = parent[0][LCA];
        }

        return LCA;
    }

    private static void dfs(int c, int d, int p) {
        depth[c] = d;
        parent[0][c] = p;
        setParent(1, c);

        for (int child : A[c]) {
            if (child != p) {
                dfs(child, d + 1, c);
            }
        }
    }

    private static void setParent(int k, int n) {
        if (k < 1 || k >= K) {
            return;
        }

        parent[k][n] = parent[k-1][parent[k-1][n]];
        setParent(k + 1, n);
    }
}