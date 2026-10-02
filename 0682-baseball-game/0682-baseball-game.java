class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st = new Stack<>();
        int n = op.length;
        int i = 0;
        while(i < n){
            String a = op[i];
            if(a.equals("+")){
                int add = 0;
                add += st.peek();
                int t = st.pop();
                add += st.peek();
                st.push(t);
                st.push(add);
            }
            else if(a.equals("D")){
                int d = 2 * st.peek();
                st.push(d);
            }
            else if(a.equals("C")){
                st.pop();
            }
            else{
                st.push(Integer.parseInt(a));
            }
            i++;
        }
        int ans = 0;
        while(!st.isEmpty()){
            ans += st.pop();
        }
        return ans;
    }
}