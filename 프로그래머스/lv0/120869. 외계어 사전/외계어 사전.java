class Solution {
    public int solution(String[] spell, String[] dic) {
        for (String dict : dic) {
            if (dict.length() != spell.length){
                continue;
            }
            for (String s : spell) {
                dict = dict.replaceFirst(s, "");
            }
            if (dict.isEmpty()) {
                return 1;
            }
        }
        return 2;
    }
}