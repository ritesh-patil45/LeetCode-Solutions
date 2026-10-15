class Solution {
    public String removeStars(String s) {
        String ans = new String();
        Stack<Character> st = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        int i = 0;
        int n = s.length();
        while(i < n){
            if(s.charAt(i) != '*'){
                st.push(s.charAt(i));
                i++;
            }
            else{
                st.pop();
                i++;
            }
        }
        while(!st.isEmpty()){
            st2.push(st.pop());
        }
        while(!st2.isEmpty()){
            ans += st2.pop();
        }
        return ans;
    }
}