import java.util.Scanner;
public class Main {
    static Integer[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        dp = new Integer[N + 1];
        dp[0] = 0;
        dp[1] = 0;
        System.out.println(find(N));
    }

    private static int find(int N) {
        if (dp[N] == null) {
            if (N % 6 == 0) {
                dp[N] = Math.min(Math.min(find(N / 3), find(N / 2)), find(N - 1)) + 1;
            } else if (N % 3 == 0) {
                dp[N] = Math.min(find(N / 3), find(N - 1)) + 1;
            } else if (N % 2 == 0) {
                dp[N] = Math.min(find(N / 2), find(N - 1)) + 1;
            } else {
                dp[N] = find(N - 1) + 1;
            }
        }
        return dp[N];
    }
}