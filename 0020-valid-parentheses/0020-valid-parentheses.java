class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int i = 0;
        int n = s.length();
        while(i < n){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
                i++;
            }
            else{
                if(st.isEmpty()) return false;
                char ch = s.charAt(i);
                char top = st.peek();
                if((ch == ')' && top == '(') ||
                   (ch == '}' && top == '{') ||
                   (ch == ']' && top == '[')) {
                    st.pop();
                    i++;
                }
                else{
                    return false;
                }
            }
        }
        if(st.isEmpty()) return true;
        return false;
    }
}