class Solution {
    String reverse(Stack<Character> st){
        if(st.isEmpty()) return "";
        char top = st.pop();
        String ans = reverse(st);
        ans += top;
        return ans;
    }
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        int i = 0;
        int n = s.length();
        while(i < n){
            char c = s.charAt(i);
            if(st.isEmpty()){
                st.push(c);
                i++;
            }
            else{
                char top = st.peek();
                if(top == c){
                    st.pop();
                }
                else{
                    st.push(c);
                }
                i++;
            }
        }
        String ans = new String("");
        ans = reverse(st);
        return ans;
    }
}