class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        for (String s : babbling) {
            while (s.startsWith("aya") || s.startsWith("ye") || s.startsWith("woo") || s.startsWith("ma")) {
                if (s.startsWith("aya")) s = s.replaceFirst("aya", "");
                if (s.startsWith("ye"))  s = s.replaceFirst("ye", "");
                if (s.startsWith("woo"))  s = s.replaceFirst("woo", "");
                if (s.startsWith("ma"))  s = s.replaceFirst("ma", "");
            }
            if (s.length() == 0) {
                answer++;
            }
        }

        return answer;
    }
}