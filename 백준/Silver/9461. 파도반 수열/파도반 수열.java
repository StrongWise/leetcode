import java.util.Scanner;

public class Main {
    static long[] ary;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        ary = new long[101];
        ary[0] = 1;
        ary[1] = 1;
        ary[2] = 1;
        ary[3] = 2;
        ary[4] = 2;
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            if (ary[N - 1] == 0) {
                for (int n = 5; n < N; n++) {
                    if (ary[n] == 0) {
                        ary[n] = ary[n - 1] + ary[n - 5];
                    }
                }
            }
            System.out.println(ary[N - 1]);
        }
    }
}
