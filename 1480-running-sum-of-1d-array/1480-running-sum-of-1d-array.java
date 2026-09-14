class Solution {
    public int[] runningSum(int[] arr) {
        int sum = 0;
        int n = arr.length;
        int i = 0;
        while(i < n){
            sum += arr[i];
            arr[i] = sum;
            i++;
        }
        return arr;
    }
}