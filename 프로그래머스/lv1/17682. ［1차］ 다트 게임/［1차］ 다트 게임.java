class Solution {
    public int solution(String dartResult) {
        int answer = 0;

        String[] digits = dartResult.split("\\D+");
        String[] letters = dartResult.split("\\d+");
        int[] scores = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            int score = Integer.parseInt(digits[i]);
            String bonus = letters[i + 1].substring(0,1);
            String option = letters[i + 1].substring(1);

            int pow = "S".equals(bonus) ? 1 : "D".equals(bonus) ? 2 : "T".equals(bonus) ? 3 : 0;

            switch (option) {
                case "":
                    scores[i] = (int) Math.pow(score, pow);
                    break;
                case "#":
                    scores[i] = (int) Math.pow(score, pow) * -1;
                    break;
                case "*":
                    scores[i] = (int) Math.pow(score, pow) * 2;
                    if (i > 0) {
                        scores[i - 1] = scores[i - 1] * 2;
                    }
                    break;
            }

        }
        for (int score : scores) {
            answer += score;
        }

        return answer;
    }
}