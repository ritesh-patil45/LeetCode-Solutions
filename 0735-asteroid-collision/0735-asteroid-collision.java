class Solution {
    public int[] asteroidCollision(int[] ast) {
        int n = ast.length;
        Stack<Integer> st = new Stack<>();
        int i = 0;
        int size = 0;
        while(i < n){
            if(st.isEmpty()){
                st.push(ast[i]);
                i++;
            }
            else if(st.peek() > 0 && ast[i] < 0 && (st.peek() + ast[i]) == 0){
                st.pop();
                i++;
            }
            else if(st.peek() > 0 && ast[i] > 0){
                st.push(ast[i]);
                i++;
            }
            else if(st.peek() < 0 && ast[i] > 0){
                st.push(ast[i]);
                i++;
            }
            else if(st.peek() > 0 && ast[i] < 0){
                if(st.peek() > -ast[i]){
                    i++;
                }
                else{
                    st.pop();
                }
            }
            else if(st.peek() < 0 && ast[i] < 0){
                st.push(ast[i]);
                i++;
            }
        }
        int m = st.size();
        int[] ans = new int[m];
        i = m-1;
        while(!st.isEmpty()){
            ans[i] = st.pop();
            i--;
        }
        return ans;
    }
}