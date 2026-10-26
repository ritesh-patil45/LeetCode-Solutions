class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int depth = 0;
        while(i < s.length()){
            char c = s.charAt(i);
            if(depth == 0){
                depth++;
                i++;
            }
            else if(c == ')' && depth == 1){
                depth--;
                i++;
            }
            else{
                if(c == ')'){
                    sb.append(c);
                    depth--;
                }
                else{
                    sb.append(c);
                    depth++;
                }
                i++;
            }
        }
        return sb.toString();
    }
}