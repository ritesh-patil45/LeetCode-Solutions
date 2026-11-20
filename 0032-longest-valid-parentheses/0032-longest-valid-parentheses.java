class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int n = s.length();
        int i = 0;
        int max = 0;
        st.push(-1);
        while(i < n){
            char c = s.charAt(i);
            if(c == '('){
                st.push(i);
            }
            else{
                st.pop();
                if(st.isEmpty()) st.push(i);
                else max = Math.max(max, i - st.peek());
            }
            i++;
        }
        return max;
    }
}