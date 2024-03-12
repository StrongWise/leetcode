import java.io.*;

public class Main {

    private static int[] A;
    private static int[] operatorCount;
    private static int N;
    private static int MAX = Integer.MIN_VALUE;
    private static int MIN = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        A = new int[N];
        operatorCount = new int[4];

        String[] s = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(s[i]);
        }
        s = br.readLine().split(" ");
        for (int i = 0; i < 4; i++) {
            operatorCount[i] = Integer.parseInt(s[i]);
        }

        calculate(0, A[0]);
        System.out.println(MAX);
        System.out.println(MIN);
    }

    private static void calculate(int count, int value) {
        if (count == N - 1) {
            if (value > MAX) {
                MAX = value;
            }
            if (value < MIN) {
                MIN = value;
            }
            return;
        }

        for (int i = 0; i < 4; i++) {
            int operator = operatorCount[i];
            if (operator > 0) {
                operatorCount[i]--;
                if (i == 0) {
                    calculate(count + 1, value + A[count + 1]);
                } else if (i == 1) {
                    calculate(count + 1, value - A[count + 1]);
                } else if (i == 2) {
                    calculate(count + 1, value * A[count + 1]);
                } else {
                    calculate(count + 1, value / A[count + 1]);
                }
                operatorCount[i]++;
            }
        }
    }
}
