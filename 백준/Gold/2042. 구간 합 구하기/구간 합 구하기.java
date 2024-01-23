import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static long[] tree;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int K = Integer.parseInt(s[2]);

        int treeHeight = 0;
        while ((int) Math.pow(2, treeHeight) < N) {
            treeHeight++;
        }

        int treeSize = (int) Math.pow(2, treeHeight + 1);
        int leftNodeStartIndex = treeSize / 2;
        tree = new long[treeSize];

        for (int i = leftNodeStartIndex; i < leftNodeStartIndex + N; i++) {
            tree[i] = Long.parseLong(br.readLine());
        }

        int n = treeSize - 1;
        while (n != 1) {
            tree[n / 2] += tree[n];
            n--;
        }
        for (int i = 0; i < M + K; i++) {
            String[] s1 = br.readLine().split(" ");
            int a = Integer.parseInt(s1[0]);
            int b = Integer.parseInt(s1[1]);
            long c = Long.parseLong(s1[2]);

            if (a == 1) { // 수 변경
                changeValue(leftNodeStartIndex - 1 + b, c);
            } else if (a == 2) { // 구간합
                int startIdx = b + leftNodeStartIndex - 1;
                int endIdx = (int) (c + leftNodeStartIndex - 1);
                long partSum = 0;
                while (startIdx <= endIdx) {
                    if (startIdx % 2 == 1) {
                        partSum += tree[startIdx];
                    }
                    if (endIdx % 2 == 0) {
                        partSum += tree[endIdx];
                    }
                    startIdx = (startIdx + 1) / 2;
                    endIdx = (endIdx - 1) / 2;
                }
                System.out.println(partSum);
            }
        }
    }

    private static void changeValue(int index, long value) {
        long diff = value - tree[index];
        while (index > 0) {
            tree[index] += diff;
            index = index / 2;
        }
    }
}