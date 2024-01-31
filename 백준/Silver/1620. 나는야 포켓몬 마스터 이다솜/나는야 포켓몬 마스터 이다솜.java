import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        Map<String, Integer> name = new HashMap<>();
        Map<Integer, String> num = new HashMap<>();
        for (int i = 1; i < N+1; i++) {
            String input = br.readLine();
            name.put(input, i);
            num.put(i, input);
        }

        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            char c = input.charAt(0);
            if (c >= 'A') {
                System.out.println(name.get(input));
            } else {
                System.out.println(num.get(Integer.parseInt(input)));
            }
        }
    }
}
