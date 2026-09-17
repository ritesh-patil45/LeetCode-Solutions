class Solution {
    public int findNumbers(int[] arr) {
        int n = arr.length;
        int even = 0;
        for(int i=0 ; i<n ; i++){
            if(arr[i] < 10){
                continue;
            }
            else if(arr[i] < 100){
                even++;
            }
            else if(arr[i] < 1000){
                continue;
            }
            else if(arr[i] < 10000){
                even++;
            }
            else if(arr[i] < 100000){
                continue;
            }
            else{
                even++;
            }
        }
        return even;
    }
}