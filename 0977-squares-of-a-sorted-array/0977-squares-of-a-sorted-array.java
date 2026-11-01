class Solution {
    public int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int r = n-1;
        int l = 0;
        int[] ans = new int[n];
        for(int i=n-1 ; i>=0 ; i--){
            int rs = arr[r] * arr[r];
            int ls = arr[l] * arr[l];
            if(rs >= ls){
                ans[i] = rs;
                r--;
            }
            else{
                ans[i] = ls;
                l++;
            }
        }
        return ans;
    }
}