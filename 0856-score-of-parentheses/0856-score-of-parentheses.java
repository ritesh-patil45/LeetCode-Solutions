class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int n = s.length();
        int i=0;
        st.push(0);
        int score = 0;
        while(i < n){
            char c = s.charAt(i);
            if(c == ')'){
                int a = st.pop();
                int val = Math.max(1, a*2);
                score = val + st.pop();
                st.push(score);
            }
            else{
                st.push(0);
            }
            i++;
        }
        return st.peek();
    }
}