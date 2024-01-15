import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] ary = new int[N];

        for (int i = 0; i < N; i++) {
            ary[i] = Integer.parseInt(br.readLine());
        }


        for (int j = 0; j < N - 1; j++) {
            for (int i = 0; i < N - j - 1; i++) {
                if (ary[i] > ary[i + 1]) {
                    int temp = ary[i];
                    ary[i] = ary[i + 1];
                    ary[i + 1] = temp;
                }
            }
        }

        for (int i : ary) {
            System.out.println(i);
        }
    }
}