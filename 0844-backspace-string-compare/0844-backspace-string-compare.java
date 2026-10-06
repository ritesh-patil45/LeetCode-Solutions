class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        int m = t.length();
        String a = new String();
        String b = new String();
        int i = 0;
        while(i < n){
            if(st.isEmpty()){
                if(s.charAt(i) == '#'){
                    i++;
                    continue;
                }
                else{
                    st.push(s.charAt(i));
                }
            }
            else if(s.charAt(i) == '#'){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
            i++;
        }
        while(!st.isEmpty()){
            a += st.pop();
        }
        i = 0;
        while(i < m){
            if(st.isEmpty()){
                if(t.charAt(i) == '#'){
                    i++;
                    continue;
                }
                else{
                    st.push(t.charAt(i));
                }
            }
            else if(t.charAt(i) == '#'){
                st.pop();
            }
            else{
                st.push(t.charAt(i));
            }
            i++;
        }
        while(!st.isEmpty()){
            b += st.pop();
        }
        if(a.equals(b)) return true;
        return false;
    }
}