class Solution {
    public String solution(String rsp) throws Exception{
        char[] chars = rsp.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char aChar : chars) {
            switch (aChar) {
                case '2':
                    sb.append('0');
                    break;
                case '0':
                    sb.append('5');
                    break;
                case '5':
                    sb.append('2');
                    break;
                default:
                    throw new Exception();
            }
        }

        return sb.toString();
    }
}