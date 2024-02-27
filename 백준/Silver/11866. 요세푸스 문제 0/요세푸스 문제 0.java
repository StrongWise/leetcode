import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = sc.nextInt();
        int K = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        int removeIdx = K - 1;

        bw.write("<");
        while (!list.isEmpty()) {
            
            bw.write(list.get(removeIdx)+"");
            list.remove(removeIdx);
            removeIdx += (K - 1);
            if (list.isEmpty()) {
                break;
            } else if (removeIdx >= list.size()) {
                removeIdx %= list.size();
            }
            bw.write(", ");
        }
        bw.write(">");
        bw.flush();
        bw.close();
    }
}
