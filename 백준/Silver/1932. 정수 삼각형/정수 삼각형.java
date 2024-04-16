import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] ary = new int[N][N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < s.length; j++) {
                ary[i][j] = Integer.parseInt(s[j]);
                if (i != 0) {
                    if (j == 0) {
                        ary[i][j] = ary[i][j] + ary[i - 1][j];
                    } else if (i == j) {
                        ary[i][j] = ary[i][j] + ary[i - 1][j - 1];
                    } else {
                        ary[i][j] = ary[i][j] + Math.max(ary[i - 1][j], ary[i - 1][j - 1]);
                    }
                }
            }
        }
        System.out.println(Arrays.stream(ary[N - 1]).max().getAsInt());
    }
}
