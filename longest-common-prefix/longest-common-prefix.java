class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        char ch = ' ';
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                try {
                    if (j == 0) {
                        ch = strs[j].charAt(i);
                    }
                    if (ch != strs[j].charAt(i)) {
                        return result;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    return result;
                } catch (StringIndexOutOfBoundsException e) {
                    return result;
                }
            }
            result += ch;
            ch = ' ';
        }

        return result;
        
    }
}