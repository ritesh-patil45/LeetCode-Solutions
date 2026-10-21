class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        int i = 0;
        Stack<Integer> st = new Stack<>();
        int c = 0;
        while(i < n){
            int a = num.charAt(i) - '0';
            if(st.isEmpty()) st.push(a);
            else if(c == k){
                while(i < n){
                    a = num.charAt(i) - '0';
                    st.push(a);
                    i++;
                }
                break;
            }
            else if(st.peek() > a){
                while(st.size() != 0 && st.peek() > a){
                    st.pop();
                    c++;
                    if(c == k) break;
                }
                st.push(a);
            }
            else{
                st.push(a);
            }
            i++;
        }
        if(c != k){
            while(c != k){
                st.pop();
                c++;
            }
        }
        StringBuilder ans = new StringBuilder("");
        while(!st.isEmpty()){
            String s = String.valueOf(st.pop());
            ans.insert(0, s);
        }
        while(ans.length() > 0 && ans.charAt(0) == '0'){
            ans.deleteCharAt(0);
        }
        if(ans.length() == 0){
            ans.insert(0, "0");
        }
        return ans.toString();
    }
}