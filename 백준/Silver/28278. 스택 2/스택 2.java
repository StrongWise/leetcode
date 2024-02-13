import java.io.*;
public class Main {
    static int[] queue;
    static int top;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        queue = new int[N + 1];
        top = 0;

        for (int i = 0; i < N; i++) {
            String command = br.readLine();
            char c = command.charAt(0);

            switch (c) {
                case '1':
                    push(Integer.parseInt(command.split(" ")[1]));
                    break;
                case '2':
                    bw.write(pop() + "\n");
                    break;
                case '3':
                    bw.write(top + "\n");
                    break;
                case '4':
                    bw.write((top == 0 ? 1 : 0) + "\n");
                    break;
                case '5':
                    bw.write(peek() + "\n");
                    break;
                default:
                    break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }

    private static int peek() {
        if (top != 0) {
            return queue[top - 1];
        } else {
            return -1;
        }
    }
    private static int pop() {
        if (top != 0) {
            return queue[top-- - 1];
        } else {
            return -1;
        }
    }

    private static void push(int X) {
        queue[top++] = X;
    }
}