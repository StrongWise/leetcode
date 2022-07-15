class Solution {
    public String reverseWords(String s) {
        List<String> strList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != ' '){
                sb.append(s.charAt(i));
            } else {
                if(sb.length() != 0){
                    strList.add(sb.toString());
                }
                sb = new StringBuilder();
            }
        }
        
        if(sb.length() != 0){
            strList.add(sb.toString());
        }
        
        sb = new StringBuilder();
        for(int i = strList.size()-1; i >= 0; i--) {
            sb.append(strList.get(i));
            if(i != 0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}