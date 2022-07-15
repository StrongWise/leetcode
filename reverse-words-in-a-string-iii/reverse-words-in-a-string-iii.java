class Solution {
    public String reverseWords(String s) {
        List<String> strList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != ' '){
                sb.append(s.charAt(i));
            } else {
                if(sb.length() != 0){
                    strList.add(sb.reverse().toString());
                }
                sb = new StringBuilder();
            }
        }
        
        if(sb.length() != 0){
            strList.add(sb.reverse().toString());
        }
        
        sb = new StringBuilder();
        for(int i = 0; i < strList.size(); i++) {
            sb.append(strList.get(i));
            if(i != strList.size()-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}