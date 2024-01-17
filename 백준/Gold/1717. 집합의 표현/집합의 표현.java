import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        A = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            A[i] = i;
        }

        for (int i = 0; i < M; i++) {
            s = br.readLine().split(" ");
            int op = Integer.parseInt(s[0]);
            int a = Integer.parseInt(s[1]);
            int b = Integer.parseInt(s[2]);
            if (op == 0) {
                union(a, b);
            } else if (op == 1) {
                if (find(a) == find(b)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

    private static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a != b) {
            A[b] = a;
        }
    }

    private static int find(int a) {
        if (A[a] == a) {
            return a;
        } else {
            return A[a] = find(A[a]);
        }
    }
}