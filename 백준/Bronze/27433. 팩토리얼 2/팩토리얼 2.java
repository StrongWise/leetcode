import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(fac(sc.nextInt()));
    }

    private static long fac(int N) {
        if (N == 0) {
            return 1;
        } else if (N > 1) {
            return N * fac(N - 1);
        } else {
            return N;
        }
    }
}