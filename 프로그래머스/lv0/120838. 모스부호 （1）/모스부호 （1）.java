import java.util.*;
class Solution {
    public String solution(String letter) {
        String[] morse = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Map<String, Character> map = new HashMap<>();
        for (int i = 0; i < morse.length; i++) {
            map.put(morse[i], (char) (i+97));
        }

        String[] letters = letter.split(" ");
        StringBuilder answer = new StringBuilder();
        for (String c : letters) {
            answer.append(map.get(c));
        }
        return answer.toString();
    }
}