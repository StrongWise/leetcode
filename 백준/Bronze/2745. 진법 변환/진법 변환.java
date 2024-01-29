import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int B = sc.nextInt();
        int answer = 0;

        for (int i = N.length() - 1; i >= 0 ; i--) {
            char c = N.charAt(i);
            int b = 0;
            if (c - 'A' >= 0) {
                b = 10 + (c - 'A');
            } else {
                b = c - '0';
            }
            int pow = (int) Math.pow(B, N.length() - i - 1);
            answer += b * pow;
        }

        System.out.println(answer);
    }
}