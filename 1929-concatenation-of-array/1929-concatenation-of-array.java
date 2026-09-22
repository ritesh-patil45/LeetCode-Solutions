class Solution {
    public int[] getConcatenation(int[] arr) {
        int n = arr.length;
        int[] ans = new int[2*n];
        int i = 0;
        int j = i+n;
        while(i < n){
            ans[i] = arr[i];
            ans[j] = arr[i];
            i++;
            j++;
        }
        return ans;
    }
}