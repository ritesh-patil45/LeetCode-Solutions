class Solution {
    boolean count(int[] arr, int mid, int hr){
        long total = 0;
        for(int i=0 ; i<arr.length ; i++){
            total += (arr[i] + mid - 1) / mid;
        }
        if(total <= hr) return true;
        else return false;
    }
    public int minEatingSpeed(int[] arr, int h) {
        int n = arr.length;
        int max = 0;
        for(int i=0 ; i<n ; i++){
            max = Math.max(max, arr[i]);
        }
        int low = 1;
        int high = max;
        int mid = n;
        int result = n;

        while(low <= high){
            mid = low + (high-low)/2;
            boolean flag = count(arr, mid, h);
            if(flag == true){
                high = mid-1;
            }
            else low = mid+1;
        }
        return low;
    }
}