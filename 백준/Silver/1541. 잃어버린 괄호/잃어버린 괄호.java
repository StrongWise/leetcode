import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] split = str.split("-");
        int result = 0;
        for (int i = 0; i < split.length; i++) {
            int temp = subSum(split[i]);
            if (i == 0) {
                result += temp;
            } else {
                result -= temp;
            }
        }

        System.out.println(result);
    }

    private static int subSum(String minus) {
        int sum = 0;
        String[] split = minus.split("\\+");
        for (String s : split) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }
}