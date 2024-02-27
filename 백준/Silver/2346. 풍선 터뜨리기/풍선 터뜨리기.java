import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        Deque<int[]> deque = new ArrayDeque<>();
        String[] s = br.readLine().split(" ");

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(s[i]));
        }

        bw.write("1 ");
        int in = arr.get(0);

        for (int i = 1; i < N; i++) {
            deque.add(new int[]{(i + 1), arr.get(i)});
        }

        while (!deque.isEmpty()) {
            if (in > 0) {
                for (int i = 1; i < in; i++) {
                    deque.add(deque.poll());
                }
                int[] nxt = deque.poll();
                in = nxt[1];
                bw.write(nxt[0] + " ");
            } else {
                for (int i = 1; i < -in; i++) {
                    deque.addFirst(deque.pollLast());
                }

                int[] nxt = deque.pollLast();
                in = nxt[1];
                bw.write(nxt[0] + " ");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
