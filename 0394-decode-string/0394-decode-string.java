class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        int i = 0;
        while(i < n){
            while(i < n && s.charAt(i) != ']'){
                st.push(s.charAt(i));
                i++;
            }
            if(i >= n) break;
            StringBuilder sb = new StringBuilder();
            while(!st.isEmpty() && st.peek() != '['){
                sb.insert(0, st.pop());
            }
            if(!st.isEmpty()) st.pop();
            StringBuilder num = new StringBuilder();
            while(!st.isEmpty() && Character.isDigit(st.peek())){
                num.insert(0, st.pop());
            }
            int count = Integer.parseInt(num.toString());
            StringBuilder repeat = new StringBuilder();
            for(int j=0 ; j<count ; j++){
                repeat.append(sb);
            }
            char[] repeats = repeat.toString().toCharArray();
            int m = repeats.length;
            for(int j=0 ; j<m ; j++){
                st.push(repeats[j]);
            }
            i++;
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            ans.insert(0, st.pop());
        }
        return ans.toString();
    }
}