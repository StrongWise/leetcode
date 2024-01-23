import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Integer>[] A;
    static boolean[] visit;
    static int[][] parentDepth;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        A = new ArrayList[N + 1];
        visit = new boolean[N + 1];
        parentDepth = new int[2][N + 1];
        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            A[a].add(b);
            A[b].add(a);
        }

        dfs(1, 1, 0);

        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            sb.append(getLCA(a, b)).append("\n");
        }
        System.out.println(sb);
    }

    private static int getLCA(int a, int b) {
        int aDepth = parentDepth[1][a];
        int bDepth = parentDepth[1][b];

        if (aDepth > bDepth) {
            while (aDepth != bDepth) {
                a = parentDepth[0][a];
                aDepth--;
            }
        } else {
            while (aDepth != bDepth) {
                b = parentDepth[0][b];
                bDepth--;
            }
        }

        while (a != b) {
            a = parentDepth[0][a];
            b = parentDepth[0][b];
        }
        return a;
    }

    private static void dfs(int cur, int depth, int parent) {
		parentDepth[0][cur] = parent;
		parentDepth[1][cur] = depth;
		for(int child : A[cur]) {
			if(child != parent) {
				dfs(child, depth+1, cur);
			}
		}
    }
}