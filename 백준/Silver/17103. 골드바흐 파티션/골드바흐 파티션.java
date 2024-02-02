import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean[] primes = new boolean[1000001];
        primes[0] = true;
        primes[1] = true;
        for (int i = 2; i < primes.length; i++) {
            if (!primes[i]) {
                for (int j = i + i; j < primes.length; j = i + j) {
                    primes[j] = true;
                }
            }
        }

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int input = sc.nextInt();
            int count = 0;
            for (int j = 2; j <= input / 2; j++) {
                if (!primes[j] && !primes[input - j]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
