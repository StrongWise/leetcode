import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        int denominator = b * d;
        int numerator = (a * d + c * b);

        int gcd = gcd(Math.max(denominator, numerator), Math.min(denominator, numerator));
        System.out.println(numerator / gcd + " " + denominator / gcd);
    }

    private static int gcd(int a, int b) {
        int r;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
