class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st = new Stack<>();
        int n = prices.length;
        int[] ans = new int[n];
        for(int i=n-1 ; i>=0 ; i--){
            if(st.isEmpty()){
                ans[i] = prices[i];
            }
            else{
                while(!st.isEmpty() && st.peek() > prices[i]){
                    st.pop();
                }
                if(!st.isEmpty()) ans[i] = prices[i] - st.peek();
                else ans[i] = prices[i];
            }
            st.push(prices[i]);
        }
        return ans;
    }
}