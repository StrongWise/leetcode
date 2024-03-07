import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            String[] s = br.readLine().split(" ");
            int N = Integer.parseInt(s[0]);
            int M = Integer.parseInt(s[1]);

            int[][] D = new int[M + 1][M + 1];

            for (int i = 1; i < M + 1; i++) {
                D[1][i] = i;
                D[i][i] = 1;
            }

            for (int i = 2; i < N + 1; i++) {
                for (int j = i + 1; j < M + 1; j++) {
                    D[i][j] = D[i - 1][j - 1] + D[i][j - 1];
                }
            }
            System.out.println(D[N][M]);
        }

    }
}