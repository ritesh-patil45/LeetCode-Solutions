class Solution {
    public String makeGood(String s) {
        int n = s.length();
        int i = n-1;
        Stack<Character> st = new Stack<>();
        while(i >= 0){
            char c = s.charAt(i);
            if(st.isEmpty()){
                st.push(c);
                i--;
            }
            else if(Math.abs(st.peek() - c) == 32){
                st.pop();
                i--;
            }
            else{
                st.push(c);
                i--;
            }
        }
        String ans = "";
        while(!st.isEmpty()){
            ans += st.pop();
        }
        return ans;
    }
}