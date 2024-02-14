import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        Stack<Integer> stack = new Stack<>();
        int ticket = 1;
        for (int i = 0; i < N; i++) {
            int order = Integer.parseInt(s[i]);
            if (!stack.isEmpty() && stack.peek() == ticket) {
                stack.pop();
                i--;
                ticket++;
            } else {
                stack.push(order);
            }
        }
        
        while (!stack.isEmpty()) {
            if (stack.pop() == ticket) {
                ticket++;
            } else {
                break;
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}