
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int divisorCount = Integer.parseInt(br.readLine());
        List<Integer> collect = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int max = collect.stream().max(Integer::compareTo).get();
        int min = collect.stream().min(Integer::compareTo).get();
        System.out.println(max * min);
    }
}