class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        int n = command.length();
        int i = 0;
        while(i < n){
            char c = command.charAt(i);
            if(st.isEmpty() && c != '('){
                st.push(c);
                sb.append(c);
            }
            else if(c == ')' && st.peek() == '('){
                st.push(c);
                sb.append('o');
            }
            else if(c == '('){
                st.push('(');
            }
            else if(c == ')'){
                st.push(')');
            }
            else {
                st.push(c);
                sb.append(c);
            }
            i++;
        }
        return sb.toString();
    }
}