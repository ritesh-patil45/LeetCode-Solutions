class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] nums2 = new int[2*n]; 
        int m = nums2.length;
        for(int i=0 ; i<m ; i++){
            int idx = i % n ;
            nums2[i] = nums[idx];
        }
        Stack<Integer> st = new Stack<>();
        int i = m-1;
        while(i >= 0){
            if(st.isEmpty()){
                st.push(nums2[i]);
                i--;
            }
            else{
                if(st.peek() > nums2[i]){
                    if(i < n) ans[i] = st.peek();
                    st.push(nums2[i]);
                    i--;
                }
                else{
                    while(!st.isEmpty() && st.peek() <= nums2[i]){
                        st.pop();
                    }
                    if(st.isEmpty() && i < n) ans[i] = -1;
                    else if(i < n) ans[i] = st.peek();
                    st.push(nums2[i]);
                    i--;
                }
            }
        }
        return ans;
    }
}