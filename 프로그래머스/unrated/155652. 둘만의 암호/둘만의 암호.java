import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public String solution(String s, String skip, int index) {
        List<Character> alphabet = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
        Set<Character> characters = new HashSet<>();
        for (char c : skip.toCharArray()) {
            characters.add(c);
        }
        alphabet = alphabet.stream().filter(e -> !characters.contains(e)).collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(alphabet.get((alphabet.indexOf(c) + index) % alphabet.size()));
        }

        return sb.toString();
    }
}