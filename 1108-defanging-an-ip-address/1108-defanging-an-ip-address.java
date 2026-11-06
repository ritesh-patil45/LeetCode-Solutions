class Solution {
    public String defangIPaddr(String address) {
        Stack<Character> st = new Stack<>();
        int i = address.length()-1; 
        while(i >= 0){
            char c = address.charAt(i);
            if(c == '.'){
                st.push(']');
                st.push('.');
                st.push('[');
            }
            else{
                st.push(c);
            }
            i--;
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.toString();
    }
}