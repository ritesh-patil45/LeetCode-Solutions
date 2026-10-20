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
    int[] findnge(int[] nge, int[] arr){
        Stack<Integer> st3 = new Stack<>();
        int l3 = arr.length;
        for(int i=l3-1 ; i>=0 ; i--){
            while(!st3.isEmpty() && arr[st3.peek()] <= arr[i]){
                st3.pop();
            }
            if(st3.isEmpty()) nge[i] = l3;
            else nge[i] = st3.peek();
            st3.push(i);
        }
        return nge;
    }
    int[] findpgee(int[] pgee, int[] arr){
        Stack<Integer> st4 = new Stack<>();
        int l4 = arr.length;
        for(int i=0 ; i<l4 ; i++){
            while(!st4.isEmpty() && arr[st4.peek()] < arr[i]){
                st4.pop();
            }
            if(st4.isEmpty()) pgee[i] = -1;
            else pgee[i] = st4.peek();
            st4.push(i);
        }
        return pgee;
    }
    public long subArrayRanges(int[] arr) {
        long smalltotal = 0;
        long largetotal = 0;
        int n = arr.length;
        int[] nse = new int[n];
        int[] psee = new int[n];
        int[] nge = new int[n];
        int[] pgee = new int[n];
        nse = findnse(nse, arr);
        psee = findpsee(psee, arr);
        nge = findnge(nge, arr);
        pgee = findpgee(pgee, arr);
        long left = 0;
        long right = 0;
        for(int i=0 ; i<n ; i++){
            left = i - psee[i];
            right = nse[i] - i;
            smalltotal = smalltotal + arr[i] * left * right;
        }
        for(int i=0 ; i<n ; i++){
            left = i - pgee[i];
            right = nge[i] - i;
            largetotal = largetotal + arr[i] * left * right;
        }
        return largetotal-smalltotal;
    }
}