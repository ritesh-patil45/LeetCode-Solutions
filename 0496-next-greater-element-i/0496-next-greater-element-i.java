class Solution {
    public int[] nextGreaterElement(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] ans = new int[n];
        //Stack<Integer> st = new Stack<>();
        int i = 0;
        while(i < n){
            int j = 0;
            while(j < m && arr2[j] != arr1[i]){
                j++;
            }
            while(j < m && arr2[j] <= arr1[i]){
                j++;
            }
            if(j == m){
                ans[i] = -1;
            }
            else{
                ans[i] = arr2[j];
            }
            i++;
        }
        return ans;
    }
}