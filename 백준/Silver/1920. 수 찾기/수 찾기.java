import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] split = br.readLine().split(" ");

        Set<Integer> A = new HashSet<>();

        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(split[i]));
        }

        int M = Integer.parseInt(br.readLine());
        String[] split2 = br.readLine().split(" ");
        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            int i1 = Integer.parseInt(split2[i]);
            if (A.contains(i1)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}