
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] temp;
    static int count = 0;
    static int K;
    static int answer = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        temp = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(A, 0, N - 1);
        System.out.println(answer);
    }

    private static void mergeSort(int[] A, int p, int r) {
        if (count > K) {
            return;
        }
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(A, p, q);
            mergeSort(A, q + 1, r);
            merge(A, p, q, r);
        }
    }

    private static void merge(int[] A, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int t = 0;

        while (i <= q && j <= r) {
            if (A[i] <= A[j]) {
                temp[t++] = A[i++];
            } else {
                temp[t++] = A[j++];
            }
        }
        while (i <= q) {
            temp[t++] = A[i++];
        }
        while (j <= r) {
            temp[t++] = A[j++];
        }
        i = p;
        t = 0;
        while (i <= r) {
            count++;
            if (K == count) {
                answer = temp[t];
                break;
            }
            A[i++] = temp[t++];
        }
    }
}