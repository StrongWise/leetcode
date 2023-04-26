class Solution {
    public String solution(int age) {
        char[] chars = (age + "").toCharArray();
        StringBuilder answer = new StringBuilder();

        for (char aChar : chars) {
            aChar += 49;
            answer.append(aChar);
        }

        return answer.toString();
    }
}