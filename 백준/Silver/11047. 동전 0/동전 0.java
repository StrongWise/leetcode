import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];

        for (int i = N - 1; i >= 0; i--) {
            A[i] = sc.nextInt();
        }

        int result = 0;
        while (K > 0) {
            for (int i : A) {
                int n = K / i;
                if (n > 0) {
                    K = K % i;
                    result += n;
                }
            }
        }
        System.out.println(result);
    }
}