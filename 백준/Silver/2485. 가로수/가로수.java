import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Set<Integer> diffSet = new HashSet<>();
        List<Integer> diffList = new ArrayList<>();

        int a = Integer.parseInt(br.readLine());
        for (int i = 1; i < N; i++) {
            int b = Integer.parseInt(br.readLine());
            diffSet.add(b - a);
            diffList.add(b - a);
            a = b;
        }

        if (diffSet.size() == 1) {
            System.out.println(0);
        } else {
            int gcd = 1;
            Iterator<Integer> iterator = diffSet.iterator();
            Integer d1 = iterator.next();
            while (iterator.hasNext()) {
                Integer d2 = iterator.next();
                gcd = gcd(Math.max(d1, d2), Math.min(d1, d2));
                d1 = gcd;
            }

            int count = 0;
            for (Integer i : diffList) {
                count += (i / gcd) - 1;
            }
            System.out.println(count);
        }
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