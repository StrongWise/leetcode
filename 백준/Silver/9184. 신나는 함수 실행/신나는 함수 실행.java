import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[][][] ary;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        ary = new int[21][21][21];
        ary[0][0][0] = 1;
        while (!"-1 -1 -1".equals(str)) {
            StringTokenizer st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int w = w(a, b, c);
            bw.write("w(" + a + ", " + b + ", " + c + ") = " + w + "\n");
            str = br.readLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }

    private static int w(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        } else if (a > 20 || b > 20 || c > 20) {
            return ary[20][20][20] == 0 ? w(20, 20, 20) : ary[20][20][20];
        } else {
            int w1 = ary[a - 1][b][c] == 0 ? w(a - 1, b, c) : ary[a - 1][b][c];
            ary[a - 1][b][c] = w1;
            int w2 = ary[a - 1][b - 1][c] == 0 ? w(a - 1, b - 1, c) : ary[a - 1][b - 1][c];
            ary[a - 1][b - 1][c] = w2;
            int w3 = ary[a - 1][b][c - 1] == 0 ? w(a - 1, b, c - 1) : ary[a - 1][b][c - 1];
            ary[a - 1][b][c - 1] = w3;
            int w4 = ary[a - 1][b - 1][c - 1] == 0 ? w(a - 1, b - 1, c - 1) : ary[a - 1][b - 1][c - 1];
            ary[a - 1][b - 1][c - 1] = w4;
            int result = w1 + w2 + w3 - w4;
            ary[a][b][c] = result;
            return result;
        }
    }
}
