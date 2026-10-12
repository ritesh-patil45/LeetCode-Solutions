class Solution {
    public int[] canSeePersonsCount(int[] h) {
        int n = h.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0 ; i<n ; i++){
            while(!st.isEmpty() && h[st.peek()] <= h[i]){
                ans[st.peek()]++;
                st.pop();
            }
            if(!st.isEmpty()){
                ans[st.peek()]++;
            }
            st.push(i);
        }
        return ans;
    }
}