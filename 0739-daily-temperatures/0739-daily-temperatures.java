class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        int i = n-1;
        while(i >= 0){
            if(st.isEmpty()){
                ans[i] = 0;
                st.push(i);
                i--;
            }
            else if(temp[i] >= temp[st.peek()]){
                st.pop(); 
            }
            else{ // temp[i] < temp[st.peek()]
                ans[i] = st.peek() - i;
                st.push(i);
                i--;
            }
        }
        return ans;
    }
}