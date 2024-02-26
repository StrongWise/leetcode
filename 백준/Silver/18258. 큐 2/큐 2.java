import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        int back = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            String str = null;
            switch (s[0]) {
                case "push":
                    Integer push = Integer.valueOf(s[1]);
                    queue.offer(push);
                    back = push;
                    break;
                case "pop":
                    Integer poll = queue.poll();
                    if (poll == null) {
                        poll = -1;
                    }
                    sb.append(poll).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(queue.isEmpty() ? -1 : queue.peek()).append("\n");
                    break;
                case "back":
                    sb.append(queue.isEmpty() ? -1 : back).append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}