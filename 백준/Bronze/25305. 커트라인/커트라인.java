import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);

        String[] x = br.readLine().split(" ");
        List<Integer> collect = Arrays.stream(x).map(Integer::parseInt).sorted().collect(Collectors.toList());
        System.out.println(collect.get(N - k));
    }
}