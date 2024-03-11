import java.util.Scanner;

public class Main {
    static int count;
    static int N;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];

        queen(0);
        System.out.println(count);
    }

    private static void queen(int depth) {
        if (depth == N) {
            count++;
            return;
        }

        for (int i = 0; i < N; i++) {
            arr[depth] = i;
            boolean result = true;
            for (int j = 0; j < depth; j++) {
                if (i == arr[j]) {
                    result = false;
                    break;
                } else if (Math.abs(depth - j) == Math.abs(i - arr[j])) {
                    result = false;
                    break;
                }
            }
            if (result) {
                queen(depth + 1);
            }
        }
    }
}