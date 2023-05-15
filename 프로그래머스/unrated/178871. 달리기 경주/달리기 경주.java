import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> nameRank = new HashMap<>();
        Map<Integer, String> rankName = new HashMap<>();

        for (int i = 1; i < players.length + 1; i++) {
            nameRank.put(players[i - 1], i);
            rankName.put(i, players[i - 1]);
        }

        for (String calling : callings) {
            Integer integer = nameRank.get(calling);
            String s = rankName.get(integer - 1);

            nameRank.put(calling, integer - 1);
            nameRank.put(s, integer);

            rankName.put(integer, s);
            rankName.put(integer-1, calling);
        }

        for (int i = 1; i < players.length + 1; i++) {
            players[i-1]= rankName.get(i);
        }
        return players;
    }
}