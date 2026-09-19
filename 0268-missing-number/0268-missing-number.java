class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int i = 0;
        while(i < n){
            if(arr[i] == i || arr[i] == n) i++;
            else{
                int a = arr[i];
                int temp = arr[a];
                arr[a] = arr[i];
                arr[i] = temp;
            }
        }
        for(int j=0 ; j<n ; j++){
            if(arr[j] != j){
                return j;
            }
        }
        return n;
    }
}