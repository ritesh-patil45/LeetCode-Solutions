class Solution {
    int[] findnse(int[] nse, int[] arr){
        Stack<Integer> st = new Stack<>();
        int l = arr.length;
        for(int i=l-1 ; i>=0 ; i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            if(st.isEmpty()) nse[i] = l;
            else nse[i] = st.peek();
            st.push(i);
        }
        return nse;
    }
    int[] findpsee(int[] psee, int[] arr){
        Stack<Integer> st2 = new Stack<>();
        int l2 = arr.length;
        for(int i=0 ; i<l2 ; i++){
            while(!st2.isEmpty() && arr[st2.peek()] > arr[i]){
                st2.pop();
            }
            if(st2.isEmpty()) psee[i] = -1;
            else psee[i] = st2.peek();
            st2.push(i);
        }
        return psee;
    }  
    public int sumSubarrayMins(int[] arr) {
        long total = 0;
        int n = arr.length;
        int[] nse = new int[n];
        int[] psee = new int[n];
        long mod = (long)1e9+7; 
        nse = findnse(nse, arr);
        psee = findpsee(psee, arr);
        for(int i=0 ; i<n ; i++){
            int left = i - psee[i];
            int right = nse[i] - i;
            total = (total + arr[i] * left % mod * right) % mod;
        }
        return (int)total;
    }
}