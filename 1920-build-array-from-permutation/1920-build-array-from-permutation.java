class Solution {
    public int[] buildArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        for(int i=0 ; i<n ; i++){
            int idx = arr[i];
            ans[i] = arr[idx];
        }
        return ans;
    }
}