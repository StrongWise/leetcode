import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        Stack<Character> stack = new Stack<>();

        while (!".".equals(string)) {
            char[] charArray = string.toCharArray();
            boolean flag = false;
            stack.clear();
            for (char c : charArray) {
                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty() || '(' != stack.peek()) {
                        flag = true;
                        break;
                    } else {
                        stack.pop();
                    }
                } else if (c == ']') {
                    if (stack.isEmpty() || '[' != stack.peek()) {
                        flag = true;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (stack.isEmpty() && !flag) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            string = br.readLine();
        }
        br.close();
    }
}
