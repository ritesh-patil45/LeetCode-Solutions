class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i=0 ; i<n ; i++){
            char c = s.charAt(i);
            if(st.isEmpty()) st.push(c);
            else{
                if(c == ')' && st.peek() == '('){
                    st.pop();
                }
                else{
                    st.push(c);
                }
            }
        }
        int ans = 0;
        while(!st.isEmpty()){
            st.pop();
            ans++;
        }
        return ans;
    }
}