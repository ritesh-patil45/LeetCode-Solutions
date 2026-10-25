class Solution {
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        int i = 0;
        while(i < n){
            char c = s.charAt(i);
            if(st.isEmpty()){
                st.push(c);
                i++;
            }
            else if(c == 'B' && st.peek() == 'A' ||
                    c == 'D' && st.peek() == 'C'){
                st.pop();
                i++;
            }
            else{
                st.push(c);
                i++;
            }
        }
        int len = 0;
        while(!st.isEmpty()){
            st.pop();
            len++;
        }
        return len;
    }
}