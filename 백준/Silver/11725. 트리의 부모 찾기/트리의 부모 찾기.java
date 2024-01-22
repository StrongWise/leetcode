import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    static ArrayList<Integer>[] tree;
    static boolean[] isVisited;
    static int[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        tree = new ArrayList[N + 1];
        isVisited = new boolean[N + 1];
        result = new int[N + 1];

        for (int i = 0; i < N + 1; i++) {
            tree[i] = new ArrayList<>();
            isVisited[i] = false;
            result[i] = 0;
        }

        for (int i = 0; i < N - 1; i++) {
            String[] s = br.readLine().split(" ");
            int n1 = Integer.parseInt(s[0]);
            int n2 = Integer.parseInt(s[1]);

            tree[n1].add(n2);
            tree[n2].add(n1);
        }

        for (int i = 1; i < N + 1; i++) {
            dfs(i);
        }

        for (int i = 2; i < N + 1; i++) {
            System.out.println(result[i]);
        }

    }

    private static void dfs(int n) {
        isVisited[n] = true;
        for (int i : tree[n]) {
            if (!isVisited[i]) {
                result[i] = n;
                dfs(i);
            }
        }
    }
}