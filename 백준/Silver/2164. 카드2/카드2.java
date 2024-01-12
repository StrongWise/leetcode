
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        Integer pick = 0;
        for (int i = 0; i < N; i++) {
            pick = queue.poll();
            if (queue.isEmpty()) {
                System.out.println(pick);
                break;
            }
            Integer poll = queue.poll();
            queue.add(poll);
        }
    }
}