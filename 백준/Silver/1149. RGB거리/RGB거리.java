import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] ary = new int[3][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            ary[0][i] = Integer.parseInt(st.nextToken());
            ary[1][i] = Integer.parseInt(st.nextToken());
            ary[2][i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < N; i++) {
            ary[0][i] += Math.min(ary[1][i - 1], ary[2][i - 1]);
            ary[1][i] += Math.min(ary[0][i - 1], ary[2][i - 1]);
            ary[2][i] += Math.min(ary[0][i - 1], ary[1][i - 1]);
        }

        System.out.println(Math.min(ary[0][N - 1], Math.min(ary[1][N - 1], ary[2][N - 1])));
    }
}
