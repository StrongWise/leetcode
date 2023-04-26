class Solution {
    public int solution(int hp) {
        int g = hp / 5;
        int s = (hp - (g * 5)) / 3;
        int w = (hp - (g * 5) - (s * 3));

        return g+s+w;
    }
}