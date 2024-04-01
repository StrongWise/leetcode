import java.util.Scanner;

public class Main {
    static int count = 1;
    static int count2 = 0;
    static int[] ary;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fib(n);

        ary = new int[n];
        fibonacci(n);

        System.out.println(count + " " + count2);
    }

    private static int fibonacci(int n) {
        ary[0] = 1;
        ary[1] = 1;
        for (int i = 2; i < n; i++) {
            ary[i] = ary[i - 1] + ary[i - 2];
            count2++;
        }
        return ary[n - 1];
    }

    private static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        count++;
        return (fib(n - 1) + fib(n - 2));
    }
}
