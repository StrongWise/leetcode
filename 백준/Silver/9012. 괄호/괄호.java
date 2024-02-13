import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            Stack<Boolean> booleans = new Stack<>();
            char[] charArray = br.readLine().toCharArray();
            boolean isBreak = false;
            
            for (char c : charArray) {
                if (c == '(') {
                    booleans.push(true);
                } else if (c == ')') {
                    if (booleans.isEmpty()) {
                        isBreak = true;
                        break;
                    }
                    if (booleans.peek()) {
                        booleans.pop();
                    } else {
                        booleans.push(false);
                    }
                }
            }
            
            if (isBreak) {
                System.out.println("NO");
            } else if (booleans.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}