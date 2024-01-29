import java.io.*;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int M = Integer.parseInt(br.readLine());
        String[] s1 = br.readLine().split(" ");

        Set<Integer> set = Arrays.stream(s).map(Integer::parseInt).collect(Collectors.toSet());
        for (String str : s1) {
            bw.write(set.contains(Integer.parseInt(str)) ? "1 " : "0 ");
        }
        bw.flush();
        bw.close();
    }
}