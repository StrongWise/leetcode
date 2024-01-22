import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static int[][] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        A = new int[2][N];

        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            int i1 = s[0].charAt(0) - 'A';
            A[0][i1] = ".".equals(s[1]) ? -1 : s[1].charAt(0) - 'A';
            A[1][i1] = ".".equals(s[2]) ? -1 : s[2].charAt(0) - 'A';
        }

        printPreOrder(0);
        System.out.println();
        printMidOrder(0);
        System.out.println();
        printPostOrder(0);
    }

    private static void printPreOrder(int n) {
        if (n == -1) {
            return;
        }
        System.out.print((char) (n + 'A'));
        printPreOrder(A[0][n]);
        printPreOrder(A[1][n]);
    }

    private static void printMidOrder(int n) {
        if (n == -1) {
            return;
        }
        printMidOrder(A[0][n]);
        System.out.print((char) (n + 'A'));
        printMidOrder(A[1][n]);
    }

    private static void printPostOrder(int n) {
        if (n == -1) {
            return;
        }
        printPostOrder(A[0][n]);
        printPostOrder(A[1][n]);
        System.out.print((char) (n + 'A'));
    }
}
