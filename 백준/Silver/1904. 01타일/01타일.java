import java.util.Scanner;

public class Main {
    static int[] ary;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ary = new int[1000001];
        ary[0] = 0;
        ary[1] = 1;
        ary[2] = 2;
        for (int i = 3; i < N + 1; i++) {
            ary[i] = (ary[i - 1] + ary[i - 2]) % 15746;
        }
        System.out.println(ary[N]);
    }
}
