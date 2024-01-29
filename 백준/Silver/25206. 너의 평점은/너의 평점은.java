import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int subjectCount = 20;
        double majorScoreAverage = 0.0;
        double majorScoreSum = 0.0;
        double creditSum = 0.0;

        for (int i = 0; i < subjectCount; i++) {
            String[] s = br.readLine().split(" ");
            double credits = Double.parseDouble(s[1]);
            String grade = s[2];

            double score = 0.0;
            switch (grade) {
                case "A+":
                    score = 4.5;
                    break;
                case "A0":
                    score = 4.0;
                    break;
                case "B+":
                    score = 3.5;
                    break;
                case "B0":
                    score = 3.0;
                    break;
                case "C+":
                    score = 2.5;
                    break;
                case "C0":
                    score = 2.0;
                    break;
                case "D+":
                    score = 1.5;
                    break;
                case "D0":
                    score = 1.0;
                    break;
                case "F":
                    score = 0.0;
                    break;
                case "P":
                    score = -1.0;
                    break;
                default:
                    break;
            }

            if (score >= 0.0) {
                majorScoreSum += score * credits;
                creditSum += credits;
            }

        }

        if (creditSum == 0.0) {
            System.out.println(majorScoreAverage);
        } else {
            System.out.println(majorScoreSum / creditSum);
        }
    }
}