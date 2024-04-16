import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        int[] dp = new int[N + 1];
        dp[1] = array[1];
        if (N >= 2) {
            dp[2] = array[1] + array[2];
        }

        for (int n = 3; n <= N; n++) {
            dp[n] = Math.max(dp[n - 3] + array[n - 1], dp[n - 2]) + array[n];
        }


        System.out.println(dp[N]);
    }
}