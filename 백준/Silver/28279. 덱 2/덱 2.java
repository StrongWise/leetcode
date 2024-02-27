import java.io.*;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            switch (Integer.parseInt(s[0])) {
                case 1:
                    deque.offerFirst(Integer.parseInt(s[1]));
                    break;
                case 2:
                    deque.offerLast(Integer.parseInt(s[1]));
                    break;
                case 3:
                    if (deque.isEmpty()) {
                        bw.write(-1+"\n");
                    } else {
                        bw.write(deque.pollFirst()+"\n");
                    }
                    break;
                case 4:
                    if (deque.isEmpty()) {
                        bw.write(-1+"\n");
                    } else {
                        bw.write(deque.pollLast()+"\n");
                    }
                    break;
                case 5:
                    bw.write(deque.size()+"\n");
                    break;
                case 6:
                    bw.write((deque.isEmpty() ? "1" : "0") + "\n");
                    break;
                case 7:
                    if (deque.isEmpty()) {
                        bw.write(-1+"\n");
                    } else {
                        bw.write(deque.peekFirst()+"\n");
                    }
                    break;
                case 8:
                    if (deque.isEmpty()) {
                        bw.write(-1+"\n");
                    } else {
                        bw.write(deque.peekLast()+"\n");
                    }
                    break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
