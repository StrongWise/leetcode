import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int answer = 1;
        for (int i = N; i > K; i--) {
            answer *= i;
        }
        for (int i = N - K; i > 0; i--) {
            answer /= i;
        }
        System.out.println(answer);
    }
}
