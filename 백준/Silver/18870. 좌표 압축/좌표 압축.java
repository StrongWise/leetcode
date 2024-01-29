import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String[] x = br.readLine().split(" ");

        Set<Integer> collect = Arrays.stream(x).map(Integer::parseInt).collect(Collectors.toCollection(TreeSet::new));
        
        Map<Integer, Integer> map = new HashMap<>();
        int x2 = 0;
        for (Integer i : collect) {
            map.put(i, x2++);
        }

        for (int i = 0; i < N; i++) {
            bw.write(map.get(Integer.parseInt(x[i])) + " ");
        }

        bw.flush();
        bw.close();
    }
}