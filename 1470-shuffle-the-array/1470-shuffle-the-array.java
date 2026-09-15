class Solution {
    public int[] shuffle(int[] arr, int n) {
        int m = arr.length;
        int[] ans = new int[m];
        int i = 0;
        int j = (m/2);
        int k = 0;
        while(j < m){
            ans[k] = arr[i];
            k++;
            ans[k] = arr[j];
            k++;
            i++;
            j++;
        }
        return ans;
    }
}