import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> names = new HashSet<>();
        int gom = 0;
        for (int i = 0; i < N; i++) {
            String chat = br.readLine();
            if ("ENTER".equals(chat)) {
                gom += names.size();
                names.clear();
            } else {
                names.add(chat);
            }
        }
        System.out.println(gom + names.size());
    }
}