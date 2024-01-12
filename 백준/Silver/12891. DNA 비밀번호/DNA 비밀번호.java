
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int P = sc.nextInt();

        String DNA = sc.next();

        int A = sc.nextInt();
        int C = sc.nextInt();
        int G = sc.nextInt();
        int T = sc.nextInt();

        int cntA = 0;
        int cntC = 0;
        int cntG = 0;
        int cntT = 0;

        for (int i = 0; i < P; i++) {
            char c = DNA.charAt(i);

            if (c == 'A') {
                cntA++;
            } else if (c == 'C') {
                cntC++;
            } else if (c == 'G') {
                cntG++;
            } else if (c == 'T') {
                cntT++;
            }
        }

        int answer = 0;
        if (cntA >= A && cntC >= C && cntG >= G && cntT >= T) {
            answer++;
        }

        for (int i = P; i < S; i++) {
            char newC = DNA.charAt(i);
            char oldC = DNA.charAt(i-P);

            if (oldC == 'A') {
                cntA--;
            } else if (oldC == 'C') {
                cntC--;
            } else if (oldC == 'G') {
                cntG--;
            } else if (oldC == 'T') {
                cntT--;
            }

            if (newC == 'A') {
                cntA++;
            } else if (newC == 'C') {
                cntC++;
            } else if (newC == 'G') {
                cntG++;
            } else if (newC == 'T') {
                cntT++;
            }


            if (cntA >= A && cntC >= C && cntG >= G && cntT >= T) {
                answer++;
            }
        }
        
        System.out.println(answer);
    }
}