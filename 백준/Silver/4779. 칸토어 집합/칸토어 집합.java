import java.util.Scanner;

public class Main {

    public static final String SPACE = " ";
    public static final String DASH = "-";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();

            int size = (int) Math.pow(3, N);
            String string = DASH.repeat(size);
            String answer = cantor(string);
            System.out.println(answer);
        }
    }

    private static String cantor(String input) {
        int length = input.length();
        if (length >= 3) {
            String head = input.substring(0, length / 3);
            if (head.length() > 1) {
                head = cantor(head);
            }
            String tail = input.substring(2 * length / 3, length);
            if (tail.length() > 1) {
                tail = cantor(tail);
            }
            return head.concat(SPACE.repeat(length / 3)).concat(tail);
        }
        return input;
    }
}