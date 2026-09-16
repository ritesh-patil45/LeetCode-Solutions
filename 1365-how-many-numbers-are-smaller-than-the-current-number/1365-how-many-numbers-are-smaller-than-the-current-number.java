class Solution {
    public int[] smallerNumbersThanCurrent(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int[] freq = new int[101];
        for(int i=0 ; i<n ; i++){
            freq[arr[i]] += 1;
        }
        for(int i=1 ; i<=100 ; i++){
            freq[i] += freq[i-1];
        }
        for(int i=0 ; i<n ; i++){
            ans[i] = (arr[i] == 0) ? 0 : freq[arr[i]-1];
        }
        return ans;
    }
}