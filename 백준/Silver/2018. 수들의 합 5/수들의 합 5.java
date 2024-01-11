import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int sp = 1;
        int ep = 1;
        int sum = 1;
        int count = 1;

        while (ep != N) {
            if (sum == N){
                count++;
                sum += ++ep;
            } else if (sum > N) {
                sum -= sp++;
            } else {
                sum += ++ep;
            }
        }

        System.out.println(count);
    }
}