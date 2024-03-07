import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer sequencesA = new StringTokenizer(br.readLine());
        StringTokenizer sequencesB = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer sequencesC = new StringTokenizer(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();

        for (int n = 0; n < N; n++) {
            int A = Integer.parseInt(sequencesA.nextToken());
            int B = Integer.parseInt(sequencesB.nextToken());

            if (A == 0) {
                deque.add(B);
            }
        }

        for (int m = 0; m < M; m++) {
            deque.addFirst(Integer.parseInt(sequencesC.nextToken()));
            bw.write(deque.pollLast() + " ");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}