class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int a = 0;
        int b = 0;

        String[] split = polynomial.replaceAll(" ", "").split("\\+");
        for (String s : split) {
            if (s.charAt(s.length() - 1) == 'x') {
                String num = s.substring(0, s.length() - 1);
                if ("".equals(num)) {
                    a += 1;
                } else {
                    a += Integer.parseInt(num);
                }
            } else {
                b += Integer.parseInt(s);
            }
        }
        
        if (a != 0) {
            if (a == 1) {
                answer += "x";
            } else {
                answer += a + "x";
            }
        }
        if (a != 0 && b != 0) {
            answer += " + ";
        }
        if (b != 0) {
            answer += b;
        }
        return answer;
    }
}