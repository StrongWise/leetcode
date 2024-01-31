import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            long maybePrime = Long.parseLong(br.readLine());
            while (true) {
                boolean isPrime = true;
                for (long j = 2; j <= Math.sqrt(maybePrime); j++) {
                    if (maybePrime % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    if (maybePrime == 0 || maybePrime == 1) {
                        maybePrime = 2;
                    }
                    System.out.println(maybePrime);
                    break;
                }
                maybePrime++;
            }
        }
    }
}