class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] sl = new int[n];
        int[] sr = new int[n];
        int i = 0;
        // for sl
        while(i < n){
            if(st.isEmpty()){
                st.push(i);
                sl[i] = -1;
                i++;
            }
            else{
                if(arr[st.peek()] >= arr[i]){
                    st.pop();
                }
                else{
                    sl[i] = st.peek();
                    st.push(i);
                    i++;
                }
            }
        }
        st.clear();
        i = n-1;
        // for sr
        while(i >= 0){
            if(st.isEmpty()){
                st.push(i);
                sr[i] = n;
                i--;
            }
            else{
                if(arr[st.peek()] >= arr[i]){
                    st.pop();
                }
                else{
                    sr[i] = st.peek();
                    st.push(i);
                    i--;
                }
            }
        }
        int max = 0;
        for(i=0 ; i<n ; i++){
            int rec = arr[i]*(sr[i] - sl[i] - 1);
            max = Math.max(max ,rec);
        }
        return max;
    }
}