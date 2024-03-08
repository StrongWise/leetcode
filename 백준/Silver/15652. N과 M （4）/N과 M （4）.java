import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N, M;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);

        arr = new int[M];

        dfs(0);

        System.out.println(sb);
    }

    private static void dfs(int depth) {
        if (depth > 1) {
            for (int i = 1; i < M; i++) {
                if (arr[i - 1] > arr[i] && arr[i] != 0) {
                    return;
                }
            }
        }
        if (depth == M) {
            for (int i : arr) {
                sb.append(i).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < N; i++) {
            arr[depth] = i + 1;
            dfs(depth + 1);
        }
    }
}