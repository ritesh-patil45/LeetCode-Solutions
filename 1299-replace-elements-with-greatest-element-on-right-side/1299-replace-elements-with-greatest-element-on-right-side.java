class Solution {
    public int[] replaceElements(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int i = n-1;
        int[] ans = new int[n];
        while(i >= 0){
            if(st.isEmpty()){
                st.push(arr[i]);
                ans[i] = -1;
                i--;
            }
            else{
                ans[i] = st.peek();
                if(arr[i] > st.peek()){
                    st.push(arr[i]);
                }
                i--;
            }
        }
        return ans;
    }
}