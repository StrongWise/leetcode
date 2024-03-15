import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private static int N;
    private static int[][] arr;
    private static boolean[] visit;
    private static int MIN = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        visit = new boolean[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        findTeam(0, 0);
        System.out.println(MIN);
    }

    private static void findTeam(int idx, int count) {
        if (count == N / 2) {
            int A = 0;
            int B = 0;
            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (visit[i] && visit[j]) {
                        A += arr[i][j];
                        A += arr[j][i];
                    } else if (!visit[i] && !visit[j]) {
                        B += arr[i][j];
                        B += arr[j][i];
                    }
                }
            }
            int diff = Math.abs(A - B);
            MIN = Math.min(diff, MIN);
            return;
        }

        for (int i = idx; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                findTeam(i + 1, count + 1);
                visit[i] = false;
            }
        }
    }
}